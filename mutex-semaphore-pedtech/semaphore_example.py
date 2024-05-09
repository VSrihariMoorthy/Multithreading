import threading

def watch_video(student_id, tutorial_semaphore):
    # Attempt to acquire the semaphore before accessing the tutorial
    print(f"Student {student_id} is trying to access a video.")
    tutorial_semaphore.acquire()
    print(f"Student {student_id} is now watching a video.")
    
    # Simulating video watching duration
    threading.Event().wait(1)
    
    print(f"Student {student_id} finished watching the video.")
    tutorial_semaphore.release()  # Release the semaphore after watching

def run_semaphore_example():
    # Create a semaphore that allows up to 5 concurrent accesses
    tutorial_semaphore = threading.Semaphore(5)
    
    # Create threads for each student trying to access the tutorials
    students = [threading.Thread(target=watch_video, args=(i, tutorial_semaphore)) for i in range(1, 11)]
    
    # Start each thread
    for student in students:
        student.start()
    
    # Wait for all threads to complete
    for student in students:
        student.join()
