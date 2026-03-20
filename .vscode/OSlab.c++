#include <iostream>
#include <vector>
#include <string>
#include <iomanip>

using namespace std;

int main() {
    string processes[] = {"P1", "P2", "P3", "P4", "P5"};
    int n = 5;
    int burst_time[] = {24, 3, 7, 13, 21};
    
    int waiting_time[5], tat[5];
    float total_wt = 0, total_tat = 0;

    waiting_time[0] = 0; 
    for (int i = 1; i < n; i++) {
        waiting_time[i] = waiting_time[i - 1] + burst_time[i - 1];
    }

    for (int i = 0; i < n; i++) {
        tat[i] = burst_time[i] + waiting_time[i];
    }

    cout << left << setw(10) << "Process" << setw(10) << "Burst" 
         << setw(10) << "Waiting" << setw(15) << "Turnaround" << endl;
    cout << "---------------------------------------------" << endl;

    for (int i = 0; i < n; i++) {
        total_wt += waiting_time[i];
        total_tat += tat[i];
        cout << left << setw(10) << processes[i] 
             << setw(10) << burst_time[i] 
             << setw(10) << waiting_time[i] 
             << setw(15) << tat[i] << endl;
    }

    cout << "\nAverage Waiting Time: " << (float)total_wt / n << endl;
    cout << "Average Turnaround Time: " << (float)total_tat / n << endl;

    return 0;
}