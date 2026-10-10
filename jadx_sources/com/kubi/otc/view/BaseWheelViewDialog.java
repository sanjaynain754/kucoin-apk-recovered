package com.kubi.otc.view;

import com.kubi.resources.dialog.DialogFragmentHelper;
import java.util.List;
import mt.SelectWheelEntity;
import org.jetbrains.annotations.NotNull;
import p629t2.InterfaceC44627a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WheelViewDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/otc/view/BaseWheelViewDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "<init>", "()V", "getAdapter", "Lcom/contrarywind/adapter/WheelAdapter;", "Lcom/kubi/otc/view/SelectWheelEntity;", "data", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BaseWheelViewDialog extends DialogFragmentHelper implements DialogFragmentHelper.InterfaceC22882b {

    /* JADX INFO: renamed from: com.kubi.otc.view.BaseWheelViewDialog$a */
    /* JADX INFO: compiled from: WheelViewDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/otc/view/BaseWheelViewDialog$getAdapter$1", "Lcom/contrarywind/adapter/WheelAdapter;", "Lcom/kubi/otc/view/SelectWheelEntity;", "getItemsCount", "", "indexOf", "o", "getItem", "index", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20286a implements InterfaceC44627a<SelectWheelEntity> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<SelectWheelEntity> f38148a;

        public C20286a(List<SelectWheelEntity> list) {
            this.f38148a = list;
        }

        @Override // p629t2.InterfaceC44627a
        /* JADX INFO: renamed from: a */
        public int mo33651a() {
            return this.f38148a.size();
        }

        @Override // p629t2.InterfaceC44627a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SelectWheelEntity getItem(int i11) {
            if (i11 < 0 || i11 >= this.f38148a.size()) {
                return null;
            }
            return this.f38148a.get(i11);
        }

        @Override // p629t2.InterfaceC44627a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int indexOf(SelectWheelEntity o11) {
            Intrinsics.checkNotNullParameter(o11, "o");
            return this.f38148a.indexOf(o11);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: j4 */
    public final InterfaceC44627a<SelectWheelEntity> m45494j4(@NotNull List<SelectWheelEntity> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new C20286a(data);
    }

    public BaseWheelViewDialog() {
        m54236e4(this);
    }
}
