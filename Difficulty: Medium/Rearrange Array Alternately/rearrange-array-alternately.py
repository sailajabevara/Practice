class Solution:
    def rearrange(self, arr):
        arr.sort()
        l=0
        r=len(arr)-1
        i=0
        a=arr.copy()
        while l<=r:
            if i%2==0:
                arr[i]=a[r]
                r-=1
            else:
                arr[i]=a[l]
                l+=1
            i+=1
        return arr