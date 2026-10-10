package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.coroutines.t */
/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes23.dex */
@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078&X§\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m90084d2 = {"Lkotlinx/coroutines/t;", "Lkotlinx/coroutines/b1;", "", "cause", "", "b", "(Ljava/lang/Throwable;)Z", "Lkotlinx/coroutines/x1;", "getParent", "()Lkotlinx/coroutines/x1;", "getParent$annotations", "()V", "parent", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC41757t extends InterfaceC41550b1 {
    /* JADX INFO: renamed from: b */
    boolean mo91065b(@NotNull Throwable cause);

    @Nullable
    InterfaceC41775x1 getParent();
}
