import numpy as np

import numpy as np

A = np.array([[1, 2],
              [3, 4]])

B = np.array([[5, 6],
              [7, 8]])

C1 = A @ B

C2 = np.dot(A, B)

print("C1 (using @):")
print(C1)

print("C2 (using np.dot):")
print(C2)

print("is C1 == C2?")
print(C1==C2)


a = np.array([[[1, 2, 3],
               [4, 5, 6]],
              
              [[7, 8, 9],
               [10, 11, 12]]])
              
b = np.array([1, 0, 1])

result = np.dot(a, b)

print("Result:")
print(result)

tensor_A = np.array([[[1, 2]], [[3, 4]]])
tensor_B = np.array([[[5], [6]], [[7], [8]]])
result_tensor = np.dot(tensor_A, tensor_B)
print("N-D arrays result:\n", result_tensor)
# Output:
# [[[17]]
#  [39]]