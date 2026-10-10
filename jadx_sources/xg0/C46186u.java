package xg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.C41960x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: xg0.u */
/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006\u001d"}, m90084d2 = {"Lxg0/u;", "Lkotlinx/serialization/json/JsonPrimitive;", "", TtmlNode.TAG_BODY, "", "isString", "Lvg0/f;", "coerceToInlineType", "<init>", "(Ljava/lang/Object;ZLvg0/f;)V", "", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Z", "()Z", "c", "Lvg0/f;", "()Lvg0/f;", "d", "Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "content", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJsonElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonLiteral\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1#2:349\n*E\n"})
public final class C46186u extends JsonPrimitive {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isString;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC45533f coerceToInlineType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String content;

    public /* synthetic */ C46186u(Object obj, boolean z11, InterfaceC45533f interfaceC45533f, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z11, (i11 & 4) != 0 ? null : interfaceC45533f);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || C46186u.class != other.getClass()) {
            return false;
        }
        C46186u c46186u = (C46186u) other;
        return getIsString() == c46186u.getIsString() && Intrinsics.areEqual(getContent(), c46186u.getContent());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46186u(@NotNull Object body, boolean z11, @Nullable InterfaceC45533f interfaceC45533f) {
        super(null);
        Intrinsics.checkNotNullParameter(body, "body");
        this.isString = z11;
        this.coerceToInlineType = interfaceC45533f;
        this.content = body.toString();
        if (interfaceC45533f != null && !interfaceC45533f.getIsInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getContent() {
        return this.content;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getIsString() {
        return this.isString;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC45533f getCoerceToInlineType() {
        return this.coerceToInlineType;
    }

    public int hashCode() {
        return (Boolean.hashCode(getIsString()) * 31) + getContent().hashCode();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    public String toString() {
        if (getIsString()) {
            StringBuilder sb2 = new StringBuilder();
            C41960x0.m92016c(sb2, getContent());
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        return getContent();
    }
}
