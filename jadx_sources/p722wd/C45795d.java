package p722wd;

import com.kubi.core.biz.menu.more.MoreDialogSectionTab;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wd.d */
/* JADX INFO: compiled from: ShareEvent.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/core/biz/sharevm/MoreDialogEvent;", "Lcom/kubi/core/biz/sharevm/IShareCoreBizEvent;", "tab", "Lcom/kubi/core/biz/menu/more/MoreDialogSectionTab;", "<init>", "(Lcom/kubi/core/biz/menu/more/MoreDialogSectionTab;)V", "getTab", "()Lcom/kubi/core/biz/menu/more/MoreDialogSectionTab;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45795d implements InterfaceC45793b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final MoreDialogSectionTab f103216a;

    public C45795d(@NotNull MoreDialogSectionTab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        this.f103216a = tab;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final MoreDialogSectionTab getF103216a() {
        return this.f103216a;
    }
}
