import math


def chvatal_algorithm(points):
    """
    Takes a list of points as input, where each point represents a vertex of the polygon. The algorithm first checks
    if the number of points is less than 3, in which case the number of guards needed would be equal to the number of
    points.
    :param points:
    :return number of points:
    """
    num_points = len(points)
    if num_points < 3:
        return num_points

    def get_line_equation(p1, p2):
        """
        Calculates the equation of a line given two points.
        :param p1:
        :param p2:
        :return number of points:
        """
        a = p2[1] - p1[1]
        b = p1[0] - p2[0]
        c = p1[1] * p2[0] - p1[0] * p2[1]
        return a, b, c

    def is_visible(p1, p2, p3):
        """
        Checks if a point 'p3' is visible from a line segment defined by points 'p1' and 'p2'. It uses the line
        equation to determine if the point is on the correct side of the line.

        Takes a list of points as input, where each point represents a vertex of the polygon. The algorithm first
        checks if the number of points is less than 3, in which case the number of guards needed would be equal to
        the number of points.
        :param p1:
        :param p2:
        :param p3:
        :return bool: True if the point is visible and on the correct side of the line.
        """
        a, b, c = get_line_equation(p1, p2)
        return (a * p3[0] + b * p3[1] + c) >= 0

    guards = set()
    for i in range(num_points):
        j = (i + 1) % num_points
        k = (i + 2) % num_points
        if not is_visible(points[i], points[j], points[k]):
            guards.add(j)

    return len(guards)


# Example usage:
polygon = [(0, 0), (0, 1), (1, 1), (1, 0)]
guards_needed = chvatal_algorithm(polygon)
print(f"The smallest number of guards needed is: {guards_needed}")
