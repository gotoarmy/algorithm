package 재귀DFSBFS;

public class node {
    node nextpointer;
    node left;
    node right;
    int value;
//링크가 동적이네 노드가 가지고 있을 정보 연결정보가 있으면 할당해서 이어주자.
    public node(int value) {
        this.value = value;
    }
}
