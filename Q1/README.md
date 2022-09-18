궁금했던점 : https://stackoverflow.com/questions/59479432/rentention-policy-in-custom-scope-declaration-of-dagger-2

```
source : Annotations are to be discarded by the compiler, 빌드된 binary에 포함 x
binary : binary에도 포함, but reflection으로 접근 x
runtime : reflection을 통해 접근까지 가능, default
```
<img width="576" alt="image" src="https://user-images.githubusercontent.com/54823396/190897041-68525bbe-8af0-4792-aab3-ab7f7e3bc989.png">