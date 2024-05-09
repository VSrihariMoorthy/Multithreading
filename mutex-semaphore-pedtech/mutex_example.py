import threading

def watch_special_video(student_id, exclusive_video_access):
    # Attempt to acquire the mutex before accessing the video
    print(f"Student {student_id} is trying to access the special video.")
    exclusive_video_access.acquire()
    print(f"Student {student_id} is watching the special video.")
    
    # Simulating video watching duration
    threading.Event().wait(1)
    
    print(f"Student {student_id} finished watching the special video.")
    exclusive_video_access.release()  # Release the mutex after watching

def run_mutex_example():
    # Create a mutex lock object
    exclusive_video_access = threading.Lock()
    
    # Create threads for each student trying to access the video
    students = [threading.Thread(target=watch_special_video, args=(i, exclusive_video_access)) for i in range(1, 11)]
    
    # Start each thread
    for student in students:
        student.start()
    
    # Wait for all threads to complete
    for student in students:
        student.join()
