package com.kubi.assets.unify;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.UnifiedMarginCurrencySettingEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.assets.unify.y0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UnifyMarginCurrencyHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u001e\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/assets/unify/UnifyMarginCurrencyHelper;", "", "<init>", "()V", "MODE_ALL", "", "MODE_CUSTOM", "toCurrencySet", "", "currencyList", "", "toDisplayCurrencySet", "setting", "Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;", "contains", "", "currencySet", FirebaseAnalytics.Param.CURRENCY, "normalize", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyMarginCurrencyHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyMarginCurrencyHelper.kt\ncom/kubi/assets/unify/UnifyMarginCurrencyHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1617#2,9:35\n1869#2:44\n1870#2:46\n1626#2:47\n1#3:45\n1#3:48\n*S KotlinDebug\n*F\n+ 1 UnifyMarginCurrencyHelper.kt\ncom/kubi/assets/unify/UnifyMarginCurrencyHelper\n*L\n12#1:35,9\n12#1:44\n12#1:46\n12#1:47\n12#1:45\n*E\n"})
public final class UnifyMarginCurrencyHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UnifyMarginCurrencyHelper f19058a = new UnifyMarginCurrencyHelper();

    /* JADX INFO: renamed from: b */
    public final String m19894b(String str) {
        String string;
        if (str != null && (string = StringsKt.trim((CharSequence) str).toString()) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String upperCase = string.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                return upperCase;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19893a(@NotNull Set<String> currencySet, @Nullable String str) {
        Intrinsics.checkNotNullParameter(currencySet, "currencySet");
        String strM19894b = m19894b(str);
        if (strM19894b != null) {
            return currencySet.contains(strM19894b);
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Set<String> m19895c(@Nullable List<String> list) {
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String strM19894b = f19058a.m19894b((String) it.next());
            if (strM19894b != null) {
                arrayList.add(strM19894b);
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Set<String> m19896d(@Nullable UnifiedMarginCurrencySettingEntity unifiedMarginCurrencySettingEntity) {
        String upperCase;
        String mode;
        if (unifiedMarginCurrencySettingEntity == null || (mode = unifiedMarginCurrencySettingEntity.getMode()) == null) {
            upperCase = null;
        } else {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            upperCase = mode.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        }
        return (Intrinsics.areEqual(upperCase, "ALL") || Intrinsics.areEqual(upperCase, "CUSTOM")) ? m19895c(unifiedMarginCurrencySettingEntity.getMarginCurrencies()) : SetsKt.emptySet();
    }
}
