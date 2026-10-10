package xg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import yg0.AbstractC46494a;

/* JADX INFO: renamed from: xg0.d */
/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\"\u0010\u001d\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR(\u0010&\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u001f\u0012\u0004\b$\u0010%\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010)\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\n\u001a\u0004\b(\u0010\f\"\u0004\b\u0018\u0010\u000eR\"\u0010-\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R(\u00106\u001a\u00020.8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b/\u00100\u0012\u0004\b5\u0010%\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010:\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\n\u001a\u0004\b8\u0010\f\"\u0004\b9\u0010\u000eR(\u0010?\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b;\u0010\n\u0012\u0004\b>\u0010%\u001a\u0004\b<\u0010\f\"\u0004\b=\u0010\u000eR(\u0010D\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b@\u0010\n\u0012\u0004\bC\u0010%\u001a\u0004\bA\u0010\f\"\u0004\bB\u0010\u000eR(\u0010I\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bE\u0010\n\u0012\u0004\bH\u0010%\u001a\u0004\bF\u0010\f\"\u0004\bG\u0010\u000eR\"\u0010M\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010\n\u001a\u0004\bK\u0010\f\"\u0004\bL\u0010\u000eR\"\u0010P\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010\n\u001a\u0004\bO\u0010\f\"\u0004\b\u0014\u0010\u000eR\"\u0010T\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010\n\u001a\u0004\bR\u0010\f\"\u0004\bS\u0010\u000eR\"\u0010Z\u001a\u00020U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\b\u0010\u0010X\"\u0004\b'\u0010Y¨\u0006["}, m90084d2 = {"Lxg0/d;", "", "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "<init>", "(Lxg0/a;)V", "Lxg0/f;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lxg0/f;", "", "Z", "getEncodeDefaults", "()Z", "setEncodeDefaults", "(Z)V", "encodeDefaults", "b", "getExplicitNulls", "setExplicitNulls", "explicitNulls", "c", "getIgnoreUnknownKeys", "e", "ignoreUnknownKeys", "d", "isLenient", "setLenient", "getPrettyPrint", "f", "prettyPrint", "", "Ljava/lang/String;", "getPrettyPrintIndent", "()Ljava/lang/String;", "setPrettyPrintIndent", "(Ljava/lang/String;)V", "getPrettyPrintIndent$annotations", "()V", "prettyPrintIndent", "g", "getCoerceInputValues", "coerceInputValues", CmcdData.Factory.STREAMING_FORMAT_HLS, "getClassDiscriminator", "setClassDiscriminator", "classDiscriminator", "Lkotlinx/serialization/json/ClassDiscriminatorMode;", "i", "Lkotlinx/serialization/json/ClassDiscriminatorMode;", "getClassDiscriminatorMode", "()Lkotlinx/serialization/json/ClassDiscriminatorMode;", "setClassDiscriminatorMode", "(Lkotlinx/serialization/json/ClassDiscriminatorMode;)V", "getClassDiscriminatorMode$annotations", "classDiscriminatorMode", "j", "getUseAlternativeNames", "setUseAlternativeNames", "useAlternativeNames", "k", "getDecodeEnumsCaseInsensitive", "setDecodeEnumsCaseInsensitive", "getDecodeEnumsCaseInsensitive$annotations", "decodeEnumsCaseInsensitive", CmcdData.Factory.STREAM_TYPE_LIVE, "getAllowTrailingComma", "setAllowTrailingComma", "getAllowTrailingComma$annotations", "allowTrailingComma", "m", "getAllowComments", "setAllowComments", "getAllowComments$annotations", "allowComments", "n", "getAllowSpecialFloatingPointValues", "setAllowSpecialFloatingPointValues", "allowSpecialFloatingPointValues", "o", "getAllowStructuredMapKeys", "allowStructuredMapKeys", "p", "getUseArrayPolymorphism", "setUseArrayPolymorphism", "useArrayPolymorphism", "Lyg0/a;", "q", "Lyg0/a;", "()Lyg0/a;", "(Lyg0/a;)V", "serializersModule", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJson.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Json.kt\nkotlinx/serialization/json/JsonBuilder\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,684:1\n1069#2,2:685\n*S KotlinDebug\n*F\n+ 1 Json.kt\nkotlinx/serialization/json/JsonBuilder\n*L\n647#1:685,2\n*E\n"})
public final class C46168d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean encodeDefaults;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean explicitNulls;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean ignoreUnknownKeys;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isLenient;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean prettyPrint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public String prettyPrintIndent;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean coerceInputValues;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public String classDiscriminator;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public ClassDiscriminatorMode classDiscriminatorMode;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean useAlternativeNames;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean decodeEnumsCaseInsensitive;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean allowTrailingComma;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean allowComments;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean allowSpecialFloatingPointValues;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean allowStructuredMapKeys;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean useArrayPolymorphism;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public AbstractC46494a serializersModule;

    public C46168d(@NotNull AbstractC46162a json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.encodeDefaults = json.getConfiguration().getEncodeDefaults();
        this.explicitNulls = json.getConfiguration().getExplicitNulls();
        this.ignoreUnknownKeys = json.getConfiguration().getIgnoreUnknownKeys();
        this.isLenient = json.getConfiguration().getIsLenient();
        this.prettyPrint = json.getConfiguration().getPrettyPrint();
        this.prettyPrintIndent = json.getConfiguration().getPrettyPrintIndent();
        this.coerceInputValues = json.getConfiguration().getCoerceInputValues();
        this.classDiscriminator = json.getConfiguration().getClassDiscriminator();
        this.classDiscriminatorMode = json.getConfiguration().getClassDiscriminatorMode();
        this.useAlternativeNames = json.getConfiguration().getUseAlternativeNames();
        json.getConfiguration().m101797l();
        this.decodeEnumsCaseInsensitive = json.getConfiguration().getDecodeEnumsCaseInsensitive();
        this.allowTrailingComma = json.getConfiguration().getAllowTrailingComma();
        this.allowComments = json.getConfiguration().getAllowComments();
        this.allowSpecialFloatingPointValues = json.getConfiguration().getAllowSpecialFloatingPointValues();
        this.allowStructuredMapKeys = json.getConfiguration().getAllowStructuredMapKeys();
        this.useArrayPolymorphism = json.getConfiguration().getUseArrayPolymorphism();
        this.serializersModule = json.getSerializersModule();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final JsonConfiguration m101778a() {
        if (this.useArrayPolymorphism) {
            if (!Intrinsics.areEqual(this.classDiscriminator, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (this.classDiscriminatorMode != ClassDiscriminatorMode.POLYMORPHIC) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (this.prettyPrint) {
            if (!Intrinsics.areEqual(this.prettyPrintIndent, "    ")) {
                String str = this.prettyPrintIndent;
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char cCharAt = str.charAt(i11);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.prettyPrintIndent).toString());
                    }
                }
            }
        } else if (!Intrinsics.areEqual(this.prettyPrintIndent, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new JsonConfiguration(this.encodeDefaults, this.ignoreUnknownKeys, this.isLenient, this.allowStructuredMapKeys, this.prettyPrint, this.explicitNulls, this.prettyPrintIndent, this.coerceInputValues, this.useArrayPolymorphism, this.classDiscriminator, this.allowSpecialFloatingPointValues, this.useAlternativeNames, null, this.decodeEnumsCaseInsensitive, this.allowTrailingComma, this.allowComments, this.classDiscriminatorMode);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC46494a getSerializersModule() {
        return this.serializersModule;
    }

    /* JADX INFO: renamed from: c */
    public final void m101780c(boolean z11) {
        this.allowStructuredMapKeys = z11;
    }

    /* JADX INFO: renamed from: d */
    public final void m101781d(boolean z11) {
        this.coerceInputValues = z11;
    }

    /* JADX INFO: renamed from: e */
    public final void m101782e(boolean z11) {
        this.ignoreUnknownKeys = z11;
    }

    /* JADX INFO: renamed from: f */
    public final void m101783f(boolean z11) {
        this.prettyPrint = z11;
    }

    /* JADX INFO: renamed from: g */
    public final void m101784g(@NotNull AbstractC46494a abstractC46494a) {
        Intrinsics.checkNotNullParameter(abstractC46494a, "<set-?>");
        this.serializersModule = abstractC46494a;
    }
}
