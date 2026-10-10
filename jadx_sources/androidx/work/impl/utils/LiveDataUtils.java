package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class LiveDataUtils {

    /* JADX INFO: Add missing generic type declarations: [In] */
    /* JADX INFO: renamed from: androidx.work.impl.utils.LiveDataUtils$1 */
    public class C43481<In> implements Observer<In> {
        Out mCurrentOutput = null;
        final /* synthetic */ Object val$lock;
        final /* synthetic */ Function val$mappingMethod;
        final /* synthetic */ MediatorLiveData val$outputLiveData;
        final /* synthetic */ TaskExecutor val$workTaskExecutor;

        public C43481(TaskExecutor taskExecutor, Object obj, Function function, MediatorLiveData mediatorLiveData) {
            this.val$workTaskExecutor = taskExecutor;
            this.val$lock = obj;
            this.val$mappingMethod = function;
            this.val$outputLiveData = mediatorLiveData;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@Nullable final In in2) {
            this.val$workTaskExecutor.executeOnTaskThread(new Runnable() { // from class: androidx.work.impl.utils.LiveDataUtils.1.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v3, types: [Out, java.lang.Object] */
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (C43481.this.val$lock) {
                        try {
                            ?? Apply = C43481.this.val$mappingMethod.apply(in2);
                            C43481 c43481 = C43481.this;
                            Out out = c43481.mCurrentOutput;
                            if (out == 0 && Apply != 0) {
                                c43481.mCurrentOutput = Apply;
                                c43481.val$outputLiveData.postValue(Apply);
                            } else if (out != 0 && !out.equals(Apply)) {
                                C43481 c43482 = C43481.this;
                                c43482.mCurrentOutput = Apply;
                                c43482.val$outputLiveData.postValue(Apply);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            });
        }
    }

    @NonNull
    @SuppressLint({"LambdaLast"})
    public static <In, Out> LiveData<Out> dedupedMappedLiveDataFor(@NonNull LiveData<In> liveData, @NonNull Function<In, Out> function, @NonNull TaskExecutor taskExecutor) {
        Object obj = new Object();
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new C43481(taskExecutor, obj, function, mediatorLiveData));
        return mediatorLiveData;
    }

    private LiveDataUtils() {
    }
}
