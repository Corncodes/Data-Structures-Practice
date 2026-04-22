def merge(nums1, m, nums2, n):
    # Initialize pointer p1 to point to the last valid element in nums1
    p1 = m - 1
    # Initialize pointer p2 to point to the last element in nums2
    p2 = n - 1
    # Initialize pointer p to point to the last position in the merged array
    p = m + n - 1

    # Compare elements from both arrays from right to left
    # Continue while both pointers are within valid ranges
    while p1 >= 0 and p2 >= 0:
        # If current element in nums1 is larger than current element in nums2
        if nums1[p1] > nums2[p2]:
            # Place the larger element from nums1 at the current position
            nums1[p] = nums1[p1]
            # Move nums1 pointer to the left
            p1 -= 1
        else:
            # Place the element from nums2 at the current position
            nums1[p] = nums2[p2]
            # Move nums2 pointer to the left
            p2 -= 1
        # Move the merged array pointer to the left
        p -= 1

    # If there are remaining elements in nums2, copy them to nums1
    # (remaining elements in nums1 are already in their correct positions)
    while p2 >= 0:
        # Copy remaining nums2 element to current position
        nums1[p] = nums2[p2]
        # Move nums2 pointer to the left
        p2 -= 1
        # Move the merged array pointer to the left
        p -= 1


# Test the merge function
# Create nums1 array with space for merged result (3 valid elements + 3 zeros)
nums1 = [1, 2, 3, 0, 0, 0]
# Create nums2 array to merge
nums2 = [2, 5, 6]
# Call merge function: nums1 has 3 valid elements, nums2 has 3 elements
merge(nums1, 3, nums2, 3)
# Print the merged result: [1, 2, 2, 3, 5, 6]
print(nums1)
