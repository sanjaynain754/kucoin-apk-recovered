package com.kubi.core.biz.margininfo.dialog;

import com.kubi.utils.extensions.C27041f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.core.biz.margininfo.dialog.c */
/* JADX INFO: compiled from: UnifyLoanCurrencySelectDialog.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\u001a0\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0000¨\u0006\u0007"}, m90084d2 = {"resolveVisibleLoanCurrencies", "", "", "baseCurrency", "quoteCurrency", "supportedCurrencies", "", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyLoanCurrencySelectDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyLoanCurrencySelectDialog.kt\ncom/kubi/core/biz/margininfo/dialog/UnifyLoanCurrencySelectDialogKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n774#2:251\n865#2,2:252\n1617#2,9:254\n1869#2:263\n295#2,2:264\n1870#2:267\n1626#2:268\n1#3:266\n*S KotlinDebug\n*F\n+ 1 UnifyLoanCurrencySelectDialog.kt\ncom/kubi/core/biz/margininfo/dialog/UnifyLoanCurrencySelectDialogKt\n*L\n45#1:251\n45#1:252,2\n50#1:254,9\n50#1:263\n51#1:264,2\n50#1:267\n50#1:268\n50#1:266\n*E\n"})
public final class C11948c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<String> m21947a(@Nullable String str, @Nullable String str2, @NotNull Set<String> supportedCurrencies) {
        Object next;
        Intrinsics.checkNotNullParameter(supportedCurrencies, "supportedCurrencies");
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new String[]{str, str2});
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return CollectionsKt.toList(supportedCurrencies);
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str3 : arrayList) {
            Iterator<T> it = supportedCurrencies.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.equals(C27041f.m66677q((String) next), C27041f.m66677q(str3), true));
            String str4 = (String) next;
            if (str4 != null) {
                arrayList2.add(str4);
            }
        }
        return CollectionsKt.distinct(arrayList2);
    }
}
