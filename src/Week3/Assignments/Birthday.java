package Week3.Assignments;

public class Birthday {
    // Suppose that people enter a room one at a time. How people must enter until two share a birthday? Counterintuitively, after 23 people enter the room, there is approximately a 50–50 chance that two share a birthday. This phenomenon is known as the birthday problem or birthday paradox.
    //Write a program Birthday.java that takes two integer command-line arguments n and trials and performs the following experiment, trials times:
    //
    //Choose a birthday for the next person, uniformly at random between 0 and n−1.
    //Have that person enter the room.
    //If that person shares a birthday with someone else in the room, stop; otherwise repeat.
    //In each experiment, count the number of people that enter the room. Print a table that summarizes the results (the count i, the number of times that exactly i people enter the room, and the fraction of times that i or fewer people enter the room) for each possible value of i from 1 until the fraction reaches (or exceeds) 50%.
    //sampling from a discrete distribution
    //~/Desktop/arrays> java Birthday 365 1000000
    //1	0	0.0
    //2	2710	0.00271
    //3	5547	0.008257
    //4	8105	0.016362
    //5	10776	0.027138
    //6	13413	0.040551
    //7	15782	0.056333
    //8	17816	0.074149
    //9	20283	0.094432
    //10	22297	0.116729
    //11	24105	0.140834
    //12	26013	0.166847
    //13	27247	0.194094
    //14	28405	0.222499
    //15	29873	0.252372
    //16	30447	0.282819
    //17	31445	0.314264
    //18	31837	0.346101
    //19	32559	0.37866
    //20	32244	0.410904
    //21	32357	0.443261
    //22	32020	0.475281
    //23	31667	0.506948
    //
    //~/Desktop/arrays> java Birthday 31 1000000
    //1	0	0.0
    //2	32270	0.03227
    //3	62580	0.09485
    //4	87582	0.182432
    //5	105596	0.288028
    //6	114427	0.402455
    //7	115494	0.517949
    //The birthday problem arises in many computer science applications, including hashing, cryptographic attacks, and testing random number generators.
    // It is also a popular example in probability theory courses, demonstrating the counterintuitive nature of probability.
}
