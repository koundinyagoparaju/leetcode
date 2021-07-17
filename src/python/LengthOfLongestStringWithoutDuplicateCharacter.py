def lengthOfLongestSubstring(s):
    
  	
    max_len = 0
    traversed = []

    for i in range(len(s)):
        if s[i] not in traversed:
            traversed.append(s[i])
            max_len = max(len(traversed), max_len)
        else:
            max_len = max(len(traversed), max_len)
            traversed = traversed[traversed.index(s[i])+1:] + [s[i]]
            print(traversed, max_len)

    return max_len 
