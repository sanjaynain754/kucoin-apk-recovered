package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.payment.service.IPaymentSiteService;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.extensions.C27041f;
import ht.C38346y;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mt.SelectLabel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FastBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012$\u0010\u0002\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003\u0018\u00010\u0003\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u0004J\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004J'\u0010\u001c\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003Je\u0010\u001f\u001a\u00020\u00002&\b\u0002\u0010\u0002\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003\u0018\u00010\u00032\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020!HÖ\u0001J\t\u0010'\u001a\u00020\u0004HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!R/\u0010\u0002\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006-"}, m90084d2 = {"Lcom/kubi/otc/entity/FastSymbol;", "Landroid/os/Parcelable;", "currencyAmounts", "", "", "Lcom/kubi/otc/entity/FastLimits;", "icons", "legalIcons", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getCurrencyAmounts", "()Ljava/util/Map;", "getIcons", "getLegalIcons", "legalIcon", "legal", "coinIcon", "coin", "buyLegals", "", "firstLegal", "firstCoin", "selectLegals", "Lcom/kubi/otc/view/SelectLabel;", "initialLegal", "selectCoins", "Lcom/kubi/sdk/widget/dialog/SelectEntity;", "initialCoin", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFastBean.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastBean.kt\ncom/kubi/otc/entity/FastSymbol\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,350:1\n1#2:351\n17#3,2:352\n2423#4,14:354\n1563#4:368\n1634#4,3:369\n1056#4:372\n1563#4:373\n1634#4,3:374\n1056#4:377\n*S KotlinDebug\n*F\n+ 1 FastBean.kt\ncom/kubi/otc/entity/FastSymbol\n*L\n51#1:352,2\n52#1:354,14\n57#1:368\n57#1:369,3\n58#1:372\n62#1:373\n62#1:374,3\n69#1:377\n*E\n"})
public final /* data */ class FastSymbol implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FastSymbol> CREATOR = new Creator();

    @Nullable
    private final Map<String, Map<String, FastLimits>> currencyAmounts;

    @Nullable
    private final Map<String, String> icons;

    @Nullable
    private final Map<String, String> legalIcons;

    /* JADX INFO: compiled from: FastBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FastSymbol> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastSymbol createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            LinkedHashMap linkedHashMap3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            LinkedHashMap linkedHashMap4 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i11 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    String string = parcel.readString();
                    if (parcel.readInt() == 0) {
                        linkedHashMap2 = null;
                    } else {
                        int i13 = parcel.readInt();
                        linkedHashMap2 = new LinkedHashMap(i13);
                        for (int i14 = 0; i14 != i13; i14++) {
                            linkedHashMap2.put(parcel.readString(), parcel.readInt() == 0 ? null : FastLimits.CREATOR.createFromParcel(parcel));
                        }
                    }
                    linkedHashMap.put(string, linkedHashMap2);
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap3 = null;
            } else {
                int i15 = parcel.readInt();
                linkedHashMap3 = new LinkedHashMap(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    linkedHashMap3.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() != 0) {
                int i17 = parcel.readInt();
                linkedHashMap4 = new LinkedHashMap(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    linkedHashMap4.put(parcel.readString(), parcel.readString());
                }
            }
            return new FastSymbol(linkedHashMap, linkedHashMap3, linkedHashMap4);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastSymbol[] newArray(int i11) {
            return new FastSymbol[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FastSymbol)) {
            return false;
        }
        FastSymbol fastSymbol = (FastSymbol) other;
        return Intrinsics.areEqual(this.currencyAmounts, fastSymbol.currencyAmounts) && Intrinsics.areEqual(this.icons, fastSymbol.icons) && Intrinsics.areEqual(this.legalIcons, fastSymbol.legalIcons);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FastSymbol copy$default(FastSymbol fastSymbol, Map map, Map map2, Map map3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = fastSymbol.currencyAmounts;
        }
        if ((i11 & 2) != 0) {
            map2 = fastSymbol.icons;
        }
        if ((i11 & 4) != 0) {
            map3 = fastSymbol.legalIcons;
        }
        return fastSymbol.copy(map, map2, map3);
    }

    @Nullable
    public final List<String> buyLegals() {
        Set<String> setKeySet;
        Map<String, Map<String, FastLimits>> map = this.currencyAmounts;
        if (map == null || (setKeySet = map.keySet()) == null) {
            return null;
        }
        return CollectionsKt.toList(setKeySet);
    }

    @Nullable
    public final String coinIcon(@NotNull String coin) {
        Intrinsics.checkNotNullParameter(coin, "coin");
        Map<String, String> map = this.icons;
        if (map != null) {
            return map.get(coin);
        }
        return null;
    }

    @Nullable
    public final Map<String, Map<String, FastLimits>> component1() {
        return this.currencyAmounts;
    }

    @Nullable
    public final Map<String, String> component2() {
        return this.icons;
    }

    @Nullable
    public final Map<String, String> component3() {
        return this.legalIcons;
    }

    @NotNull
    public final FastSymbol copy(@Nullable Map<String, ? extends Map<String, FastLimits>> currencyAmounts, @Nullable Map<String, String> icons, @Nullable Map<String, String> legalIcons) {
        return new FastSymbol(currencyAmounts, icons, legalIcons);
    }

    @Nullable
    public final String firstCoin(@NotNull String legal) {
        Map<String, FastLimits> map;
        Set<String> setKeySet;
        Object next;
        String str;
        String strMo45625e;
        Intrinsics.checkNotNullParameter(legal, "legal");
        Map<String, Map<String, FastLimits>> map2 = this.currencyAmounts;
        Object next2 = null;
        if (map2 == null || (map = map2.get(legal)) == null || (setKeySet = map.keySet()) == null) {
            return null;
        }
        Iterator<T> it = setKeySet.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            str = (String) next;
            Object objM56186h = Router.f46192a.m56186h(IPaymentSiteService.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h == null || (strMo45625e = ((IPaymentSiteService) objM56186h).mo45625e()) == null) {
                strMo45625e = "USDT";
            }
        } while (!Intrinsics.areEqual(str, strMo45625e));
        String str2 = (String) next;
        if (str2 != null) {
            return str2;
        }
        Iterator<T> it2 = setKeySet.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                String str3 = (String) next2;
                do {
                    Object next3 = it2.next();
                    String str4 = (String) next3;
                    if (str3.compareTo(str4) > 0) {
                        next2 = next3;
                        str3 = str4;
                    }
                } while (it2.hasNext());
            }
        }
        return C27041f.m66668h((String) next2);
    }

    @Nullable
    public final Map<String, Map<String, FastLimits>> getCurrencyAmounts() {
        return this.currencyAmounts;
    }

    @Nullable
    public final Map<String, String> getIcons() {
        return this.icons;
    }

    @Nullable
    public final Map<String, String> getLegalIcons() {
        return this.legalIcons;
    }

    public int hashCode() {
        Map<String, Map<String, FastLimits>> map = this.currencyAmounts;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, String> map2 = this.icons;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.legalIcons;
        return iHashCode2 + (map3 != null ? map3.hashCode() : 0);
    }

    @Nullable
    public final String legalIcon(@NotNull String legal) {
        Intrinsics.checkNotNullParameter(legal, "legal");
        Map<String, String> map = this.legalIcons;
        if (map != null) {
            return map.get(legal);
        }
        return null;
    }

    @Nullable
    public final List<SelectEntity> selectCoins(@NotNull String legal, @NotNull String initialCoin) {
        Map<String, FastLimits> map;
        Set<String> setKeySet;
        Intrinsics.checkNotNullParameter(legal, "legal");
        Intrinsics.checkNotNullParameter(initialCoin, "initialCoin");
        Map<String, Map<String, FastLimits>> map2 = this.currencyAmounts;
        if (map2 == null || (map = map2.get(legal)) == null || (setKeySet = map.keySet()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
        for (String str : setKeySet) {
            arrayList.add(new SelectEntity(null, str, str, null, coinIcon(str), null, null, null, null, false, Intrinsics.areEqual(initialCoin, str), null, 3049, null));
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.kubi.otc.entity.FastSymbol$selectCoins$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return ComparisonsKt.compareValues(((SelectEntity) t11).getValue(), ((SelectEntity) t12).getValue());
            }
        });
    }

    @Nullable
    public final List<SelectLabel> selectLegals(@NotNull String initialLegal) {
        Set<String> setKeySet;
        Intrinsics.checkNotNullParameter(initialLegal, "initialLegal");
        Map<String, Map<String, FastLimits>> map = this.currencyAmounts;
        if (map == null || (setKeySet = map.keySet()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
        for (String str : setKeySet) {
            arrayList.add(new SelectLabel(str, legalIcon(str), Boolean.valueOf(Intrinsics.areEqual(initialLegal, str)), null, 8, null));
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.kubi.otc.entity.FastSymbol$selectLegals$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return ComparisonsKt.compareValues(((SelectLabel) t11).getValue(), ((SelectLabel) t12).getValue());
            }
        });
    }

    @NotNull
    public String toString() {
        return "FastSymbol(currencyAmounts=" + this.currencyAmounts + ", icons=" + this.icons + ", legalIcons=" + this.legalIcons + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Map<String, Map<String, FastLimits>> map = this.currencyAmounts;
        if (map == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry<String, Map<String, FastLimits>> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                Map<String, FastLimits> value = entry.getValue();
                if (value == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(value.size());
                    for (Map.Entry<String, FastLimits> entry2 : value.entrySet()) {
                        dest.writeString(entry2.getKey());
                        FastLimits value2 = entry2.getValue();
                        if (value2 == null) {
                            dest.writeInt(0);
                        } else {
                            dest.writeInt(1);
                            value2.writeToParcel(dest, flags);
                        }
                    }
                }
            }
        }
        Map<String, String> map2 = this.icons;
        if (map2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map2.size());
            for (Map.Entry<String, String> entry3 : map2.entrySet()) {
                dest.writeString(entry3.getKey());
                dest.writeString(entry3.getValue());
            }
        }
        Map<String, String> map3 = this.legalIcons;
        if (map3 == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map3.size());
        for (Map.Entry<String, String> entry4 : map3.entrySet()) {
            dest.writeString(entry4.getKey());
            dest.writeString(entry4.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FastSymbol(@Nullable Map<String, ? extends Map<String, FastLimits>> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3) {
        this.currencyAmounts = map;
        this.icons = map2;
        this.legalIcons = map3;
    }

    @Nullable
    public final String firstLegal() {
        List<String> listBuyLegals = buyLegals();
        if (listBuyLegals != null) {
            return C38346y.m86536w(listBuyLegals);
        }
        return null;
    }
}
