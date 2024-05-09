**Program Guide**
1. mutex_example.py
This file contains the mutex implementation for exclusive access to a special tutorial video.

2. semaphore_example.py
This file manages the semaphore-based synchronization for watching video tutorials with limited concurrency.

3. main.py
This file serves as the entry point and lets you choose which example to run.

To run either the mutex or semaphore example, execute main.py. The user will be prompted to choose which synchronization example to run. Each file is thoroughly commented to explain the logic and function calls, enhancing readability and maintainability.

**Sample Output 
Mutex:**
'''
Choose an example to run:
1: Mutex Example
2: Semaphore Example
Enter your choice (1 or 2): 1
Student 1 is trying to access the special video.
Student 1 is watching the special video.
Student 2 is trying to access the special video.
Student 3 is trying to access the special video.
Student 4 is trying to access the special video.
Student 5 is trying to access the special video.
Student 6 is trying to access the special video.
Student 7 is trying to access the special video.
Student 8 is trying to access the special video.
Student 9 is trying to access the special video.
Student 10 is trying to access the special video.
Student 1 finished watching the special video.
Student 2 is watching the special video.
Student 2 finished watching the special video.
Student 3 is watching the special video.
Student 3 finished watching the special video.
Student 4 is watching the special video.
Student 4 finished watching the special video.
Student 5 is watching the special video.
Student 5 finished watching the special video.
Student 6 is watching the special video.
Student 6 finished watching the special video.
Student 7 is watching the special video.
Student 7 finished watching the special video.
Student 8 is watching the special video.
Student 8 finished watching the special video.
Student 9 is watching the special video.
Student 9 finished watching the special video.
Student 10 is watching the special video.
Student 10 finished watching the special video.
'''

**Semaphore:**
'''
Choose an example to run:
1: Mutex Example
2: Semaphore Example
Enter your choice (1 or 2): 2
Student 1 is trying to access a video.
Student 1 is now watching a video.
Student 2 is trying to access a video.
Student 2 is now watching a video.
Student 3 is trying to access a video.
Student 3 is now watching a video.
Student 4 is trying to access a video.
Student 6 is trying to access a video.
Student 4 is now watching a video.
Student 6 is now watching a video.
Student 5 is trying to access a video.
Student 7 is trying to access a video.
Student 8 is trying to access a video.
Student 9 is trying to access a video.
Student 10 is trying to access a video.
Student 3 finished watching the video.
Student 2 finished watching the video.
Student 6 finished watching the video.
Student 8 is now watching a video.
Student 7 is now watching a video.
Student 5 is now watching a video.
Student 1 finished watching the video.
Student 4 finished watching the video.
Student 9 is now watching a video.
Student 10 is now watching a video.
Student 7 finished watching the video.
Student 9 finished watching the video.
Student 8 finished watching the video.
Student 10 finished watching the video.
Student 5 finished watching the video.
'''
