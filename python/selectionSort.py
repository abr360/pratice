a=[10 ,9 ,26 ,29 ,18 ,2 ,20 ,7 ,19 ,15]
for i in range(0,len(a),1):
    for j in range(i+1,len(a),1):
        if a[i] >= a[j]:
           a[i],a[j]=a[j],a[i]
print(a)