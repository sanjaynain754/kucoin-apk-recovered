package androidx.camera.core.impl.utils;

import androidx.arch.core.util.Function;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiveDataUtil.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B#\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\f\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bJ,\u0010\u000e\u001a\u00020\r\"\u0004\b\u0002\u0010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u000b2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u000f0\u0012H\u0016J\u000f\u0010\u0013\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0002\u0010\u0014R\u0010\u0010\u0004\u001a\u00028\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Landroidx/camera/core/impl/utils/MappingRedirectableLiveData;", "I", "O", "Landroidx/lifecycle/MediatorLiveData;", "initialValue", "mapFunction", "Landroidx/arch/core/util/Function;", "<init>", "(Ljava/lang/Object;Landroidx/arch/core/util/Function;)V", "Ljava/lang/Object;", "liveDataSource", "Landroidx/lifecycle/LiveData;", "redirectTo", "", "addSource", ExifInterface.LATITUDE_SOUTH, "source", "onChanged", "Landroidx/lifecycle/Observer;", "getValue", "()Ljava/lang/Object;", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class MappingRedirectableLiveData<I, O> extends MediatorLiveData<O> {
    private final O initialValue;

    @Nullable
    private LiveData<I> liveDataSource;

    @NotNull
    private final Function<I, O> mapFunction;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void redirectTo$lambda$2(final MappingRedirectableLiveData mappingRedirectableLiveData, LiveData liveData) {
        final Function1 function1 = new Function1() { // from class: androidx.camera.core.impl.utils.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MappingRedirectableLiveData.redirectTo$lambda$2$lambda$0(this.f1696b, obj);
            }
        };
        super.addSource(liveData, new Observer() { // from class: androidx.camera.core.impl.utils.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                function1.invoke(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit redirectTo$lambda$2$lambda$0(MappingRedirectableLiveData mappingRedirectableLiveData, Object obj) {
        mappingRedirectableLiveData.setValue(mappingRedirectableLiveData.mapFunction.apply(obj));
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.LiveData
    @Nullable
    public O getValue() {
        LiveData<I> liveData = this.liveDataSource;
        return liveData == null ? this.initialValue : this.mapFunction.apply(liveData.getValue());
    }

    public MappingRedirectableLiveData(O o11, @NotNull Function<I, O> mapFunction) {
        Intrinsics.checkNotNullParameter(mapFunction, "mapFunction");
        this.initialValue = o11;
        this.mapFunction = mapFunction;
    }

    @Override // androidx.lifecycle.MediatorLiveData
    public <S> void addSource(@NotNull LiveData<S> source, @NotNull Observer<? super S> onChanged) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        throw new UnsupportedOperationException();
    }

    public final void redirectTo(@NotNull final LiveData<I> liveDataSource) {
        Intrinsics.checkNotNullParameter(liveDataSource, "liveDataSource");
        LiveData<I> liveData = this.liveDataSource;
        if (liveData != null) {
            Intrinsics.checkNotNull(liveData);
            super.removeSource(liveData);
        }
        this.liveDataSource = liveDataSource;
        Threads.runOnMain(new Runnable() { // from class: androidx.camera.core.impl.utils.c
            @Override // java.lang.Runnable
            public final void run() {
                MappingRedirectableLiveData.redirectTo$lambda$2(this.f1698b, liveDataSource);
            }
        });
    }
}
