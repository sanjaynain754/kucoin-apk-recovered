package p203di;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.IBrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.R$string;
import com.kubi.router.core.Router;
import com.kubi.utils.C27017c;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p559qg.InterfaceC43729a;
import p761xh.C46203d1;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: di.a */
/* JADX INFO: compiled from: AccountTypeClickFilterOfDelegation.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/futures/history/filter/AccountTypeClickFilterOfDelegation;", "Lcom/kubi/futures/history/filter/TradeTypeClickFilter;", "clickView", "Landroidx/appcompat/widget/AppCompatTextView;", "anchorView", "Landroid/view/View;", "<init>", "(Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/View;)V", "buildTradeTypeList", "", "Lcom/kubi/futures/dialog/pop/SelectTradeTypeOfHistoryPopup$TradeTypeAdapter$TradeTypeIndex;", "getCurrentRequestType", "Lcom/kubi/broker/MultiBizType;", "getChooseBroker", "Lcom/kubi/broker/IBrokerConfig;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountTypeClickFilterOfDelegation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountTypeClickFilterOfDelegation.kt\ncom/kubi/futures/history/filter/AccountTypeClickFilterOfDelegation\n+ 2 MultiBizUtils.kt\ncom/kubi/broker/MultiBizUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n11#2,6:62\n17#2,5:70\n295#3,2:68\n*S KotlinDebug\n*F\n+ 1 AccountTypeClickFilterOfDelegation.kt\ncom/kubi/futures/history/filter/AccountTypeClickFilterOfDelegation\n*L\n60#1:62,6\n60#1:70,5\n60#1:68,2\n*E\n"})
public final class C36693a extends AbstractC36711s {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36693a(@NotNull AppCompatTextView clickView, @NotNull View anchorView) {
        super(clickView, anchorView);
        Intrinsics.checkNotNullParameter(clickView, "clickView");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
    }

    @Override // p203di.AbstractC36711s
    @NotNull
    /* JADX INFO: renamed from: d */
    public List<C46203d1.a.TradeTypeIndex> mo65317d() {
        C27017c c27017c = C27017c.f54310a;
        return CollectionsKt.mutableListOf(new C46203d1.a.TradeTypeIndex(c27017c.m66516f(R$string.uta_account_uta, new Object[0]), MultiBizType.UNIFIED.getValue(), false), new C46203d1.a.TradeTypeIndex(c27017c.m66516f(R$string.uta_account_spot, new Object[0]), MultiBizType.CLASSIC.getValue(), false));
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final IBrokerConfig m82164r() {
        Object obj;
        Object next;
        MultiBizType multiBizTypeM82165s = m82165s();
        MultiBizType multiBizType = MultiBizType.CLASSIC;
        List listM56190l = Router.f46192a.m56190l(IBrokerConfig.class);
        Iterator it = listM56190l.iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (((InterfaceC43729a) next).mo4515x() != multiBizTypeM82165s);
        InterfaceC43729a interfaceC43729a = (InterfaceC43729a) next;
        if (interfaceC43729a == null && multiBizType != MultiBizType.UN_KNOW) {
            for (Object obj2 : listM56190l) {
                if (((InterfaceC43729a) obj2).mo4515x() == multiBizType) {
                    obj = obj2;
                    break;
                }
            }
            interfaceC43729a = (InterfaceC43729a) obj;
        }
        IBrokerConfig iBrokerConfig = (IBrokerConfig) interfaceC43729a;
        if (iBrokerConfig == null) {
            return BrokerConfig.f19211a.m20201d();
        }
        return iBrokerConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final MultiBizType m82165s() {
        String f79626c = getF79626c();
        MultiBizType multiBizType = MultiBizType.UNIFIED;
        if (Intrinsics.areEqual(f79626c, multiBizType.getValue())) {
            return multiBizType;
        }
        MultiBizType multiBizTypeMo4515x = BrokerConfig.f19211a.m20201d().mo4515x();
        MultiBizType multiBizType2 = MultiBizType.COPY_TRADING;
        if (multiBizTypeMo4515x == multiBizType2) {
            return multiBizType2;
        }
        return MultiBizType.CLASSIC;
    }
}
