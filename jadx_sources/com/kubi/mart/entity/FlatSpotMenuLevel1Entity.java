package com.kubi.mart.entity;

import androidx.annotation.Keep;
import com.kubi.mart.R$string;
import com.kubi.utils.C27059l;
import com.kubi.utils.extensions.C27039d;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SidebarMenuEntity.kt */
/* JADX INFO: loaded from: classes28.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0018\u001a\u00020\u0019J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003JP\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m90084d2 = {"Lcom/kubi/mart/entity/FlatSpotMenuLevel1Entity;", "", "concept", "", "nameA", "count", "", "enabled", "", "quoteCryptos", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)V", "getConcept", "()Ljava/lang/String;", "getNameA", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getQuoteCryptos", "()Ljava/util/List;", "toMenuModel", "Lcom/kubi/mart/entity/SpotMenuModel;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)Lcom/kubi/mart/entity/FlatSpotMenuLevel1Entity;", "equals", "other", "hashCode", "toString", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FlatSpotMenuLevel1Entity {

    @Nullable
    private final String concept;

    @Nullable
    private final Integer count;

    @Nullable
    private final Boolean enabled;

    @Nullable
    private final String nameA;

    @Nullable
    private final List<String> quoteCryptos;

    public FlatSpotMenuLevel1Entity() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlatSpotMenuLevel1Entity)) {
            return false;
        }
        FlatSpotMenuLevel1Entity flatSpotMenuLevel1Entity = (FlatSpotMenuLevel1Entity) other;
        return Intrinsics.areEqual(this.concept, flatSpotMenuLevel1Entity.concept) && Intrinsics.areEqual(this.nameA, flatSpotMenuLevel1Entity.nameA) && Intrinsics.areEqual(this.count, flatSpotMenuLevel1Entity.count) && Intrinsics.areEqual(this.enabled, flatSpotMenuLevel1Entity.enabled) && Intrinsics.areEqual(this.quoteCryptos, flatSpotMenuLevel1Entity.quoteCryptos);
    }

    public FlatSpotMenuLevel1Entity(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Boolean bool, @Nullable List<String> list) {
        this.concept = str;
        this.nameA = str2;
        this.count = num;
        this.enabled = bool;
        this.quoteCryptos = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlatSpotMenuLevel1Entity copy$default(FlatSpotMenuLevel1Entity flatSpotMenuLevel1Entity, String str, String str2, Integer num, Boolean bool, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = flatSpotMenuLevel1Entity.concept;
        }
        if ((i11 & 2) != 0) {
            str2 = flatSpotMenuLevel1Entity.nameA;
        }
        if ((i11 & 4) != 0) {
            num = flatSpotMenuLevel1Entity.count;
        }
        if ((i11 & 8) != 0) {
            bool = flatSpotMenuLevel1Entity.enabled;
        }
        if ((i11 & 16) != 0) {
            list = flatSpotMenuLevel1Entity.quoteCryptos;
        }
        List list2 = list;
        Integer num2 = num;
        return flatSpotMenuLevel1Entity.copy(str, str2, num2, bool, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConcept() {
        return this.concept;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNameA() {
        return this.nameA;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final List<String> component5() {
        return this.quoteCryptos;
    }

    @NotNull
    public final FlatSpotMenuLevel1Entity copy(@Nullable String concept, @Nullable String nameA, @Nullable Integer count, @Nullable Boolean enabled, @Nullable List<String> quoteCryptos) {
        return new FlatSpotMenuLevel1Entity(concept, nameA, count, enabled, quoteCryptos);
    }

    @Nullable
    public final String getConcept() {
        return this.concept;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final String getNameA() {
        return this.nameA;
    }

    @Nullable
    public final List<String> getQuoteCryptos() {
        return this.quoteCryptos;
    }

    public int hashCode() {
        String str = this.concept;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nameA;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.count;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.enabled;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.quoteCryptos;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    @NotNull
    public final SpotMenuModel toMenuModel() {
        String string;
        String str;
        String str2;
        String str3;
        List<String> listEmptyList;
        boolean zEquals = StringsKt.equals("DYNAMIC", this.concept, true);
        if (!zEquals) {
            string = this.nameA;
            if (string == null) {
                str = "";
            }
            Intrinsics.checkNotNull(str);
            String str4 = zEquals ? "DYNAMIC" : "AREA";
            str2 = this.concept;
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            int iM66650j = C27039d.m66650j(this.count) + 100;
            listEmptyList = this.quoteCryptos;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return new SpotMenuModel(str4, str3, str, iM66650j, listEmptyList);
        }
        string = C27059l.f54343a.m66757a().getString(R$string.market_currency_placeholder, this.nameA);
        str = string;
        Intrinsics.checkNotNull(str);
        String str5 = zEquals ? "DYNAMIC" : "AREA";
        str2 = this.concept;
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        int iM66650j2 = C27039d.m66650j(this.count) + 100;
        listEmptyList = this.quoteCryptos;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new SpotMenuModel(str5, str3, str, iM66650j2, listEmptyList);
    }

    @NotNull
    public String toString() {
        return "FlatSpotMenuLevel1Entity(concept=" + this.concept + ", nameA=" + this.nameA + ", count=" + this.count + ", enabled=" + this.enabled + ", quoteCryptos=" + this.quoteCryptos + ')';
    }

    public /* synthetic */ FlatSpotMenuLevel1Entity(String str, String str2, Integer num, Boolean bool, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : bool, (i11 & 16) != 0 ? null : list);
    }
}
