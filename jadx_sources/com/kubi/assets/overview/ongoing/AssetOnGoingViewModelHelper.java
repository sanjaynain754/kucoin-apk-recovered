package com.kubi.assets.overview.ongoing;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.margin.api.entity.MarginPosition;
import com.kubi.tradebase.entity.CurrencyBalance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.z, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetOnGoingViewModelHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J-\u0010\n\u001a\u00020\u000b\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\r*\b\u0012\u0004\u0012\u00020\r0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\f0\u0010H\u0086\b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModelHelper;", "", "<init>", "()V", "buildSymbol", "", "it", "Lcom/kubi/margin/api/entity/MarginPosition;", "removeDuplicateSymbols", "symbols", "replaceItemsOfType", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;", "", "newItems", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetOnGoingViewModelHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOnGoingViewModelHelper.kt\ncom/kubi/assets/overview/ongoing/AssetOnGoingViewModelHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
public final class AssetOnGoingViewModelHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AssetOnGoingViewModelHelper f18540a = new AssetOnGoingViewModelHelper();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m18886a(@NotNull MarginPosition it) {
        String currency;
        String currency2;
        Intrinsics.checkNotNullParameter(it, "it");
        CurrencyBalance baseAsset = it.getBaseAsset();
        String strM18887b = null;
        String strM18887b2 = (baseAsset == null || (currency2 = baseAsset.getCurrency()) == null) ? null : m18887b(currency2);
        CurrencyBalance quoteAsset = it.getQuoteAsset();
        if (quoteAsset != null && (currency = quoteAsset.getCurrency()) != null) {
            strM18887b = m18887b(currency);
        }
        return CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{strM18887b2, strM18887b}), ",", null, null, 0, null, null, 62, null);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m18887b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, "BTC")) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return str + "-BTC";
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m18888c(@NotNull String symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        return CollectionsKt.joinToString$default(CollectionsKt.distinct(StringsKt.split$default((CharSequence) symbols, new String[]{","}, false, 0, 6, (Object) null)), ",", null, null, 0, null, null, 62, null);
    }
}
