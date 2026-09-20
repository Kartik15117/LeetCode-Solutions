class Solution(object):
    def leastInterval(self, tasks, n):
        """
        :type tasks: List[str]
        :type n: int
        :rtype: int
        """
        freq = Counter(tasks)

        max_freq = max(freq.values())

        max_count = list(freq.values()).count(max_freq)

        result = (max_freq - 1) * (n + 1) + max_count

        return max(len(tasks), result)
        