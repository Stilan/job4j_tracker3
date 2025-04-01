package ru.job4j.tracker.collection;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> cmpDescByName = new JobDescByName();
        int rsl = cmpDescByName.compare(
                new Job("VVV", 0),
                new Job("AAA", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> cmpDescByPriority = new JobDescByPriority();
        int rsl = cmpDescByPriority.compare(
                new Job("VVV", 3),
                new Job("AAA", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorIncreasingByName() {
        Comparator<Job> cmpIncreasingByName = new JobIncreasingByName();
        int rsl = cmpIncreasingByName.compare(
                new Job("VVV", 12),
                new Job("AAA", 3)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorIncreasingByPriority() {
        Comparator<Job> cmpIncreasingByPriority = new JobIncreasingByPriority();
        int rsl = cmpIncreasingByPriority.compare(
                new Job("VVV", 3),
                new Job("AAA", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorIncreasingByNameIfIncreasingByPriority() {
        Comparator<Job> cmpIncreasingByNameIfIncreasingByPriority = new JobIncreasingByName().thenComparing(new JobIncreasingByPriority());
        int rsl = cmpIncreasingByNameIfIncreasingByPriority.compare(
                new Job("AAA", 12),
                new Job("AAA", 3)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorDescByNameIfDescByPriority() {
        Comparator<Job> cmpDescByNameIfDescByPriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpDescByNameIfDescByPriority.compare(
                new Job("AAA", 1),
                new Job("AAA", 0)
        );
        assertThat(rsl).isLessThan(0);
    }
}