import numpy as np


def simplex_method(c, A, b):
    """
    This implementation uses the NumPy library to handle matrix operations. It takes the coefficients of the
    objective function ('c'), the coefficients of the constraints ('A'), and the right-hand side values of the
    constraints ('b') as inputs. It returns the optimal solution and the values of the decision variables.

    :param c:
    :param A:
    :param b:
    :returns optimal solution:Optimized solution and values of the decision variables.
    """

    m, n = A.shape
    tableau = np.zeros((m + 1, n + 1))
    tableau[:-1, :-1] = A
    tableau[:-1, -1] = b
    tableau[-1, :-1] = c

    while np.any(tableau[-1, :-1] < 0):
        pivot_column = np.argmin(tableau[-1, :-1])
        ratios = tableau[:-1, -1] / tableau[:-1, pivot_column]
        pivot_row = np.argmin(ratios)

        tableau[pivot_row, :] /= tableau[pivot_row, pivot_column]
        for i in range(m + 1):
            if i == pivot_row:
                continue
            tableau[i, :] -= tableau[i, pivot_column] * tableau[pivot_row, :]

    optimal_solution = tableau[-1, -1]
    decision_variables = tableau[:-1, -1]

    return optimal_solution, decision_variables


# Example usage
c = np.array([-2, -3, 0, 0])  # Coefficients of the objective function
A = np.array([[1, 2, 1, 0], [2, 1, 0, 1]])  # Coefficients of the constraints
b = np.array([4, 5])  # RHS values of the constraints

optimal_solution, decision_variables = simplex_method(c, A, b)
print("Optimal Solution:", optimal_solution)
print("Decision Variables:", decision_variables)
