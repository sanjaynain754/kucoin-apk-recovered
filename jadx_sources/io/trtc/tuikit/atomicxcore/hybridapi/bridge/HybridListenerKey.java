package io.trtc.tuikit.atomicxcore.hybridapi.bridge;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39392b;
import io.trtc.tuikit.atomicxcore.hybridapi.json.JsonParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0006\u0010\u001a\u001a\u00020\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;", "", "type", "", "store", "name", "roomID", "listenerID", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getListenerID", "()Ljava/lang/String;", "getName", "getRoomID", "getStore", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toJson", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class HybridListenerKey {

    @Nullable
    private final String listenerID;

    @NotNull
    private final String name;

    @Nullable
    private final String roomID;

    @NotNull
    private final String store;

    @NotNull
    private final String type;

    public HybridListenerKey(@NotNull String type, @NotNull String store, @NotNull String name, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(name, "name");
        this.type = type;
        this.store = store;
        this.name = name;
        this.roomID = str;
        this.listenerID = str2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybridListenerKey)) {
            return false;
        }
        HybridListenerKey hybridListenerKey = (HybridListenerKey) other;
        return Intrinsics.areEqual(this.type, hybridListenerKey.type) && Intrinsics.areEqual(this.store, hybridListenerKey.store) && Intrinsics.areEqual(this.name, hybridListenerKey.name) && Intrinsics.areEqual(this.roomID, hybridListenerKey.roomID) && Intrinsics.areEqual(this.listenerID, hybridListenerKey.listenerID);
    }

    public static /* synthetic */ HybridListenerKey copy$default(HybridListenerKey hybridListenerKey, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = hybridListenerKey.type;
        }
        if ((i11 & 2) != 0) {
            str2 = hybridListenerKey.store;
        }
        if ((i11 & 4) != 0) {
            str3 = hybridListenerKey.name;
        }
        if ((i11 & 8) != 0) {
            str4 = hybridListenerKey.roomID;
        }
        if ((i11 & 16) != 0) {
            str5 = hybridListenerKey.listenerID;
        }
        String str6 = str5;
        String str7 = str3;
        return hybridListenerKey.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStore() {
        return this.store;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRoomID() {
        return this.roomID;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getListenerID() {
        return this.listenerID;
    }

    @Nullable
    public final String getListenerID() {
        return this.listenerID;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getRoomID() {
        return this.roomID;
    }

    @NotNull
    public final String getStore() {
        return this.store;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iM88220a = AbstractC39391a.m88220a(this.name, AbstractC39391a.m88220a(this.store, this.type.hashCode() * 31, 31), 31);
        String str = this.roomID;
        int iHashCode = (iM88220a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.listenerID;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toJson() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", this.type);
        jsonObject.addProperty("store", this.store);
        jsonObject.addProperty("name", this.name);
        String str = this.roomID;
        jsonObject.add("roomID", str == null ? JsonNull.INSTANCE : new JsonPrimitive(str));
        String str2 = this.listenerID;
        jsonObject.add("listenerID", str2 == null ? JsonNull.INSTANCE : new JsonPrimitive(str2));
        String json = JsonParserKt.getSharedGson().toJson((JsonElement) jsonObject);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("HybridListenerKey(type=");
        sb2.append(this.type);
        sb2.append(", store=");
        sb2.append(this.store);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", roomID=");
        sb2.append(this.roomID);
        sb2.append(", listenerID=");
        return AbstractC39392b.m88221a(sb2, this.listenerID, ')');
    }

    @NotNull
    public final HybridListenerKey copy(@NotNull String type, @NotNull String store, @NotNull String name, @Nullable String roomID, @Nullable String listenerID) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(name, "name");
        return new HybridListenerKey(type, store, name, roomID, listenerID);
    }

    public /* synthetic */ HybridListenerKey(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i11 & 16) != 0 ? null : str5);
    }
}
