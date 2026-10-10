package com.kubi.quotefacade.alpha;

import com.sensorsdata.abtest.SensorsABTest;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AlphaMarketTab3SortABTest.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/AlphaMarketTab3SortABTest;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "DEFAULT", "TRADING_VOLUME", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum AlphaMarketTab3SortABTest {
    DEFAULT("default"),
    TRADING_VOLUME("tradingVolume");


    @NotNull
    private final String rawValue;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f41142c = EnumEntriesKt.enumEntries(m50342a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: AlphaMarketTab3SortABTest.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/AlphaMarketTab3SortABTest$Companion;", "", "<init>", "()V", "PARAM_NAME", "", "current", "Lcom/kubi/quotefacade/alpha/AlphaMarketTab3SortABTest;", "isDefaultSortByTradingVolume", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAlphaMarketTab3SortABTest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaMarketTab3SortABTest.kt\ncom/kubi/quotefacade/alpha/AlphaMarketTab3SortABTest$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AlphaMarketTab3SortABTest current() {
            Object objM103844constructorimpl;
            AlphaMarketTab3SortABTest next;
            try {
                Result.Companion companion = Result.INSTANCE;
                String str = (String) SensorsABTest.shareInstance().fetchCacheABTest("kc_market_alpha_tab3_sort_sets_ab", AlphaMarketTab3SortABTest.DEFAULT.getRawValue());
                AlphaMarketTab3SortABTest alphaMarketTab3SortABTest = null;
                if (str == null) {
                    str = null;
                }
                String string = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
                if (string == null) {
                    string = "";
                }
                Iterator<AlphaMarketTab3SortABTest> it = AlphaMarketTab3SortABTest.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(next.getRawValue(), string));
                AlphaMarketTab3SortABTest alphaMarketTab3SortABTest2 = next;
                if (alphaMarketTab3SortABTest2 == null) {
                    for (AlphaMarketTab3SortABTest alphaMarketTab3SortABTest3 : AlphaMarketTab3SortABTest.getEntries()) {
                        if (StringsKt.equals(alphaMarketTab3SortABTest3.getRawValue(), string, true)) {
                            alphaMarketTab3SortABTest = alphaMarketTab3SortABTest3;
                            break;
                        }
                    }
                    alphaMarketTab3SortABTest2 = alphaMarketTab3SortABTest;
                    if (alphaMarketTab3SortABTest2 == null) {
                        alphaMarketTab3SortABTest2 = AlphaMarketTab3SortABTest.DEFAULT;
                    }
                }
                objM103844constructorimpl = Result.m103844constructorimpl(alphaMarketTab3SortABTest2);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            AlphaMarketTab3SortABTest alphaMarketTab3SortABTest4 = AlphaMarketTab3SortABTest.DEFAULT;
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = alphaMarketTab3SortABTest4;
            }
            return (AlphaMarketTab3SortABTest) objM103844constructorimpl;
        }

        public final boolean isDefaultSortByTradingVolume() {
            if (current() == AlphaMarketTab3SortABTest.TRADING_VOLUME) {
                return true;
            }
            return false;
        }
    }

    @NotNull
    public static EnumEntries<AlphaMarketTab3SortABTest> getEntries() {
        return f41142c;
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }

    AlphaMarketTab3SortABTest(String str) {
        this.rawValue = str;
    }
}
