package androidx.constraintlayout.core;

/* JADX INFO: loaded from: classes23.dex */
final class Pools {
    private static final boolean DEBUG = false;

    /* JADX INFO: loaded from: classes.dex */
    public interface Pool<T> {
        T acquire();

        boolean release(T t11);

        void releaseAll(T[] tArr, int i11);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class SimplePool<T> implements Pool<T> {
        private final Object[] mPool;
        private int mPoolSize;

        private boolean isInPool(T t11) {
            for (int i11 = 0; i11 < this.mPoolSize; i11++) {
                if (this.mPool[i11] == t11) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public void releaseAll(T[] tArr, int i11) {
            if (i11 > tArr.length) {
                i11 = tArr.length;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                T t11 = tArr[i12];
                int i13 = this.mPoolSize;
                Object[] objArr = this.mPool;
                if (i13 < objArr.length) {
                    objArr[i13] = t11;
                    this.mPoolSize = i13 + 1;
                }
            }
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public T acquire() {
            int i11 = this.mPoolSize;
            if (i11 <= 0) {
                return null;
            }
            int i12 = i11 - 1;
            Object[] objArr = this.mPool;
            T t11 = (T) objArr[i12];
            objArr[i12] = null;
            this.mPoolSize = i11 - 1;
            return t11;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public boolean release(T t11) {
            int i11 = this.mPoolSize;
            Object[] objArr = this.mPool;
            if (i11 >= objArr.length) {
                return false;
            }
            objArr[i11] = t11;
            this.mPoolSize = i11 + 1;
            return true;
        }

        public SimplePool(int i11) {
            if (i11 > 0) {
                this.mPool = new Object[i11];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
    }

    private Pools() {
    }
}
