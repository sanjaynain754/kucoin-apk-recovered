package com.kubi.lite.interceptor;

import com.kubi.lite.interceptor.LiteDialogInterceptor;
import com.kubi.lite.utils.LiteState;
import com.kubi.resources.GlobalDialogManager;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.router.core.Router;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import vn.InterfaceC45607a;

/* JADX INFO: compiled from: LiteDialogInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/lite/interceptor/LiteDialogInterceptor;", "Lcom/kubi/resources/GlobalDialogManager$IDialogInterceptor;", "<init>", "()V", "intercept", "", "dialog", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "Companion", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiteDialogInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiteDialogInterceptor.kt\ncom/kubi/lite/interceptor/LiteDialogInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n1374#2:25\n1460#2,5:26\n*S KotlinDebug\n*F\n+ 1 LiteDialogInterceptor.kt\ncom/kubi/lite/interceptor/LiteDialogInterceptor\n*L\n16#1:25\n16#1:26,5\n*E\n"})
public final class LiteDialogInterceptor implements GlobalDialogManager.a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f32082a = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy<Set<String>> f32083b = LazyKt.lazy(new Function0() { // from class: xn.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LiteDialogInterceptor.m37535d();
        }
    });

    /* JADX INFO: compiled from: LiteDialogInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/lite/interceptor/LiteDialogInterceptor$Companion;", "", "<init>", "()V", "blackDialogSet", "", "", "getBlackDialogSet", "()Ljava/util/Set;", "blackDialogSet$delegate", "Lkotlin/Lazy;", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final Set<String> m37537a() {
            return (Set) LiteDialogInterceptor.f32083b.getValue();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Set m37535d() {
        List listM56190l = Router.f46192a.m56190l(InterfaceC45607a.class);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM56190l.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((InterfaceC45607a) it.next()).m100692a());
        }
        return CollectionsKt.toSet(arrayList);
    }

    @Override // com.kubi.resources.GlobalDialogManager.a
    /* JADX INFO: renamed from: a */
    public boolean mo37536a(@NotNull BaseDialogFragment dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        return LiteState.f32201a.m37697c() && CollectionsKt.contains(f32082a.m37537a(), dialog.getF43553X());
    }
}
