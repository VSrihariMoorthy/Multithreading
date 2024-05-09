from mutex_example import run_mutex_example
from semaphore_example import run_semaphore_example

def main():
    # Prompt the user to choose which synchronization example to run
    print("Choose an example to run:")
    print("1: Mutex Example")
    print("2: Semaphore Example")
    choice = input("Enter your choice (1 or 2): ")

    if choice == '1':
        run_mutex_example()
    elif choice == '2':
        run_semaphore_example()
    else:
        print("Invalid choice. Please enter 1 or 2.")

if __name__ == "__main__":
    # Check if the script is the main program and call main function if true
    main()
