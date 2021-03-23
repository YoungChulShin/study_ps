package leetcode;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumTest {
  private TwoSum instance;

  @BeforeEach
  void setup() {
    instance = new TwoSum();
  }

  @Test
  void nums_size_below_two_return_null() {
    // given
    int[] nums = new int[1];
    int target = 10;

    // when
    int[] result = instance.twoSum(nums, target);

    // then
    Assertions.assertThat(result).isNull();
  }

  @Test
  void target_below_two_return_null() {
    // given
    int[] nums = new int[2];
    nums[0] = 3;
    nums[1] = 5;
    int target = 1;

    // when
    int[] result = instance.twoSum(nums, target);

    // then
    Assertions.assertThat(result).isNull();
  }

  @Test
  void valid_input_return_arrays_of_index() {
    // given
    int[] nums = new int[4];
    nums[0] = 2;
    nums[1] = 7;
    nums[2] = 11;
    nums[3] = 15;
    int target = 9;

    // when
    int[] result = instance.twoSum(nums, target);

    // then
    int[] expectedResult = new int[2];
    expectedResult[0] = 0;
    expectedResult[1] = 1;

    Assertions.assertThat(result.length).isEqualTo(2);
    Assertions.assertThat(result[0]).isEqualTo(expectedResult[0]);
    Assertions.assertThat(result[1]).isEqualTo(expectedResult[1]);
  }
}