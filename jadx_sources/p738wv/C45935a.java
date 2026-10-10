package p738wv;

import com.kubi.redpackage.entity.CurrenciesConfig;
import com.kubi.redpackage.entity.RedConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p703vv.InterfaceC45656a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: wv.a */
/* JADX INFO: compiled from: EuRedpacketSendFlavorImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/redpackage/flavor/impl/EuRedpacketSendFlavorImpl;", "Lcom/kubi/redpackage/flavor/IRedpacketSendFlavor;", "<init>", "()V", "getDefaultSelectedCoin", "Lcom/kubi/redpackage/entity/CurrenciesConfig;", "redConfig", "Lcom/kubi/redpackage/entity/RedConfig;", "coinConfig", "isDescendUSDT", "", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEuRedpacketSendFlavorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EuRedpacketSendFlavorImpl.kt\ncom/kubi/redpackage/flavor/impl/EuRedpacketSendFlavorImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class C45935a implements InterfaceC45656a {
    @Override // p703vv.InterfaceC45656a
    /* JADX INFO: renamed from: a */
    public boolean mo100781a() {
        return true;
    }

    @Override // p703vv.InterfaceC45656a
    @Nullable
    /* JADX INFO: renamed from: b */
    public CurrenciesConfig mo100782b(@Nullable RedConfig redConfig, @Nullable CurrenciesConfig currenciesConfig) {
        ArrayList<CurrenciesConfig> currenciesConfigs;
        CurrenciesConfig currenciesConfig2;
        ArrayList<CurrenciesConfig> currenciesConfigs2;
        Object next;
        if (currenciesConfig != null) {
            if (redConfig == null || (currenciesConfigs2 = redConfig.getCurrenciesConfigs()) == null) {
                currenciesConfig2 = null;
            } else {
                Iterator<T> it = currenciesConfigs2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((CurrenciesConfig) next).getCurrencyCode(), currenciesConfig.getCurrencyCode()));
                currenciesConfig2 = (CurrenciesConfig) next;
            }
            if (currenciesConfig2 != null) {
                return currenciesConfig2;
            }
        }
        if (redConfig == null || (currenciesConfigs = redConfig.getCurrenciesConfigs()) == null) {
            return null;
        }
        return (CurrenciesConfig) CollectionsKt.firstOrNull((List) currenciesConfigs);
    }
}
