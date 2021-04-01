package leetcode;

import data.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

  private AddTwoNumbers instance;

  @BeforeEach
  void setup() {
    instance = new AddTwoNumbers();
  }

  @Test
  void all_null_listnode_return_null() {
    // given

    // when
    ListNode listNode = instance.addTwoNumbers(null, null);

    // then
    Assertions.assertThat(listNode).isNull();
  }

  @Test
  void one_listnode_is_null_return_other() {
    // given
    ListNode listNode1 = new ListNode(1);
    ListNode listNode2 = new ListNode(2);
    ListNode listNode3 = new ListNode(3);
    listNode1.setNext(listNode2);
    listNode2.setNext(listNode3);

    // when
    ListNode listNode = instance.addTwoNumbers(listNode1, null);

    // then
    Assertions.assertThat(listNode).isNotNull();
    Assertions.assertThat(listNode.getValue()).isEqualTo(1);
    Assertions.assertThat(listNode.getNext().getValue()).isEqualTo(2);
    Assertions.assertThat(listNode.getNext().getNext().getValue()).isEqualTo(3);
  }

  @Test
  void valid_input() {
    // given
    ListNode listNode1 = new ListNode(2);
    listNode1.setNext(new ListNode(4));
    listNode1.getNext().setNext(new ListNode(3));

    ListNode listNode2 = new ListNode(5);
    listNode2.setNext(new ListNode(6));
    listNode2.getNext().setNext(new ListNode(4));

    // when
    ListNode listNode = instance.addTwoNumbers(listNode1, listNode2);

    // then
    Assertions.assertThat(listNode).isNotNull();
    Assertions.assertThat(listNode.getValue()).isEqualTo(7);
    Assertions.assertThat(listNode.getNext().getValue()).isEqualTo(0);
    Assertions.assertThat(listNode.getNext().getNext().getValue()).isEqualTo(8);
    Assertions.assertThat(listNode.getNext().getNext().getNext()).isNull();
  }

  @Test
  void valid_input2() {
    // given
    ListNode listNode1 = new ListNode(0);
    ListNode listNode2 = new ListNode(0);

    // when
    ListNode listNode = instance.addTwoNumbers(listNode1, listNode2);

    // then
    Assertions.assertThat(listNode).isNotNull();
    Assertions.assertThat(listNode.getValue()).isEqualTo(0);
    Assertions.assertThat(listNode.getNext()).isNull();
  }

  @Test
  void valid_input3() {
    // given
    ListNode listNode1 = new ListNode(9);
    listNode1.setNext(new ListNode(9));
    listNode1.getNext().setNext(new ListNode(9));
    listNode1.getNext().getNext().setNext(new ListNode(9));
    listNode1.getNext().getNext().getNext().setNext(new ListNode(9));
    listNode1.getNext().getNext().getNext().getNext().setNext(new ListNode(9));
    listNode1.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(9));

    ListNode listNode2 = new ListNode(9);
    listNode2.setNext(new ListNode(9));
    listNode2.getNext().setNext(new ListNode(9));
    listNode2.getNext().getNext().setNext(new ListNode(9));

    // when
    ListNode listNode = instance.addTwoNumbers(listNode1, listNode2);

    // then
    Assertions.assertThat(listNode).isNotNull();

    Assertions.assertThat(listNode.getValue()).isEqualTo(8);
    Assertions.assertThat(listNode.getNext().getValue()).isEqualTo(9);
    Assertions.assertThat(listNode.getNext().getNext().getValue()).isEqualTo(9);
    Assertions.assertThat(listNode.getNext().getNext().getNext().getValue()).isEqualTo(9);
    Assertions.assertThat(listNode.getNext().getNext().getNext().getNext().getValue()).isEqualTo(0);
    Assertions.assertThat(listNode.getNext().getNext().getNext().getNext().getNext().getValue()).isEqualTo(0);
    Assertions.assertThat(listNode.getNext().getNext().getNext().getNext().getNext().getNext().getValue()).isEqualTo(0);
    Assertions.assertThat(listNode.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getValue()).isEqualTo(1);
    Assertions.assertThat(listNode.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getValue()).isNull();
  }
}