package cv;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cv.g */
/* JADX INFO: compiled from: Selector.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u0014\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00018\u00008\u00000\u000eJ\u0013\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/Selector;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "data", "Ljava/util/concurrent/CopyOnWriteArrayList;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "", "select", "t", "(Ljava/lang/Object;)V", "setSelect", "", "getSelect", "kotlin.jvm.PlatformType", "isSelect", "", "(Ljava/lang/Object;)Z", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36550g<T> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final CopyOnWriteArrayList<T> f79391a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b */
    @Nullable
    public Function0<Unit> f79392b;

    /* JADX INFO: renamed from: f */
    public static final Unit m81816f(C36550g c36550g, List list) {
        c36550g.f79391a.clear();
        c36550g.f79391a.addAll(list);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<T> m81817b() {
        return CollectionsKt.toList(this.f79391a);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m81818c(T t11) {
        return this.f79391a.contains(t11);
    }

    /* JADX INFO: renamed from: d */
    public final void m81819d(T t11) {
        if (this.f79391a.contains(t11)) {
            this.f79391a.remove(t11);
        } else {
            this.f79391a.add(t11);
        }
        Function0<Unit> function0 = this.f79392b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m81820e(@NotNull final List<? extends T> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        C27100x0.m66923d(new Function0() { // from class: cv.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C36550g.m81816f(this.f79389b, data);
            }
        });
    }
}
