arr = [598457, 45678, 1236, 984, 65, 1]

for j in range(1, len(arr)):
    key = arr[j]
    i = j - 1
    while i >= 0 and arr[i] > key:
        arr[i + 1] = arr[i]
        i = i - 1
    arr[i + 1] = key

print(arr)