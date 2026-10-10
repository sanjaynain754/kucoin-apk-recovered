package okhttp3;

import com.google.common.net.HttpHeaders;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: CacheControl.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 !2\u00020\u0001:\u0002 !Bq\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0016J\r\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0017J\r\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0018J\r\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001aJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000e\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\r\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u000b\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\f\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0013\u0010\n\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u000e\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013R\u0013\u0010\r\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0013\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014¨\u0006\""}, m90084d2 = {"Lokhttp3/CacheControl;", "", "noCache", "", "noStore", "maxAgeSeconds", "", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "headerValue", "", "(ZZIIZZZIIZZZLjava/lang/String;)V", "()Z", "()I", "-deprecated_immutable", "-deprecated_maxAgeSeconds", "-deprecated_maxStaleSeconds", "-deprecated_minFreshSeconds", "-deprecated_mustRevalidate", "-deprecated_noCache", "-deprecated_noStore", "-deprecated_noTransform", "-deprecated_onlyIfCached", "-deprecated_sMaxAgeSeconds", "toString", "Builder", "Companion", "okhttp"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class CacheControl {

    @Nullable
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();

    @JvmField
    @NotNull
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    /* JADX INFO: compiled from: CacheControl.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0003\u001a\u00020\u0000J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u0000J\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lokhttp3/CacheControl$Builder;", "", "()V", "immutable", "", "maxAgeSeconds", "", "maxStaleSeconds", "minFreshSeconds", "noCache", "noStore", "noTransform", "onlyIfCached", "build", "Lokhttp3/CacheControl;", "maxAge", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "maxStale", "minFresh", "clampToInt", "", "okhttp"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCacheControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheControl.kt\nokhttp3/CacheControl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        @NotNull
        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        @NotNull
        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        @NotNull
        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        @NotNull
        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        @NotNull
        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }

        @NotNull
        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        private final int clampToInt(long j11) {
            if (j11 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j11;
        }

        @NotNull
        public final Builder maxAge(int maxAge, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (maxAge >= 0) {
                this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(maxAge));
                return this;
            }
            throw new IllegalArgumentException(("maxAge < 0: " + maxAge).toString());
        }

        @NotNull
        public final Builder maxStale(int maxStale, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (maxStale >= 0) {
                this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(maxStale));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + maxStale).toString());
        }

        @NotNull
        public final Builder minFresh(int minFresh, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (minFresh >= 0) {
                this.minFreshSeconds = clampToInt(timeUnit.toSeconds(minFresh));
                return this;
            }
            throw new IllegalArgumentException(("minFresh < 0: " + minFresh).toString());
        }
    }

    /* JADX INFO: compiled from: CacheControl.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lokhttp3/CacheControl$Companion;", "", "()V", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "parse", "headers", "Lokhttp3/Headers;", "indexOfElement", "", "", "characters", SpellCheckPlugin.START_INDEX_KEY, "okhttp"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            return companion.indexOfElement(str, str2, i11);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004b  */
        /* JADX WARN: Code duplicated, block: B:17:0x006b  */
        /* JADX WARN: Code duplicated, block: B:28:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:32:0x00de  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:36:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:37:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:39:0x0100  */
        /* JADX WARN: Code duplicated, block: B:41:0x010a  */
        /* JADX WARN: Code duplicated, block: B:43:0x0113  */
        /* JADX WARN: Code duplicated, block: B:44:0x0119  */
        /* JADX WARN: Code duplicated, block: B:46:0x0122  */
        /* JADX WARN: Code duplicated, block: B:47:0x0128  */
        /* JADX WARN: Code duplicated, block: B:49:0x0131  */
        /* JADX WARN: Code duplicated, block: B:50:0x0137  */
        /* JADX WARN: Code duplicated, block: B:52:0x0140  */
        /* JADX WARN: Code duplicated, block: B:53:0x0147  */
        /* JADX WARN: Code duplicated, block: B:55:0x0150  */
        /* JADX WARN: Code duplicated, block: B:56:0x0158  */
        /* JADX WARN: Code duplicated, block: B:58:0x0161  */
        /* JADX WARN: Code duplicated, block: B:59:0x0167  */
        /* JADX WARN: Code duplicated, block: B:61:0x0171  */
        /* JADX WARN: Code duplicated, block: B:62:0x0179  */
        /* JADX WARN: Code duplicated, block: B:64:0x0182  */
        /* JADX WARN: Code duplicated, block: B:65:0x018a  */
        /* JADX WARN: Code duplicated, block: B:67:0x0192  */
        @JvmStatic
        @NotNull
        public final CacheControl parse(@NotNull Headers headers) {
            int iIndexOfElement;
            int iIndexOfElement2;
            boolean z11;
            String string;
            int i11;
            String str;
            String string2;
            Headers headers2 = headers;
            Intrinsics.checkNotNullParameter(headers2, "headers");
            int size = headers2.size();
            boolean z12 = true;
            boolean z13 = true;
            int i12 = 0;
            String str2 = null;
            boolean z14 = false;
            boolean z15 = false;
            int nonNegativeInt = -1;
            int nonNegativeInt2 = -1;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            int nonNegativeInt3 = -1;
            int nonNegativeInt4 = -1;
            boolean z19 = false;
            boolean z21 = false;
            boolean z22 = false;
            while (i12 < size) {
                String strName = headers2.name(i12);
                String strValue = headers2.value(i12);
                if (StringsKt.equals(strName, "Cache-Control", z12)) {
                    if (str2 == null) {
                        str2 = strValue;
                    }
                    iIndexOfElement = 0;
                    while (iIndexOfElement < strValue.length()) {
                        iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                        String strSubstring = strValue.substring(iIndexOfElement, iIndexOfElement2);
                        z11 = z12;
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = StringsKt.trim((CharSequence) strSubstring).toString();
                        if (iIndexOfElement2 != strValue.length()) {
                            i11 = size;
                            if (strValue.charAt(iIndexOfElement2) == ',' && strValue.charAt(iIndexOfElement2) != ';') {
                                int iIndexOfNonWhitespace = Util.indexOfNonWhitespace(strValue, iIndexOfElement2 + 1);
                                if (iIndexOfNonWhitespace >= strValue.length() || strValue.charAt(iIndexOfNonWhitespace) != '\"') {
                                    str = strValue;
                                    iIndexOfElement = indexOfElement(str, ",;", iIndexOfNonWhitespace);
                                    String strSubstring2 = str.substring(iIndexOfNonWhitespace, iIndexOfElement);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    string2 = StringsKt.trim((CharSequence) strSubstring2).toString();
                                } else {
                                    int i13 = iIndexOfNonWhitespace + 1;
                                    String str3 = strValue;
                                    int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str3, '\"', i13, false, 4, (Object) null);
                                    str = str3;
                                    String strSubstring3 = str.substring(i13, iIndexOf$default);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                    iIndexOfElement = iIndexOf$default + 1;
                                    string2 = strSubstring3;
                                }
                            }
                            if (StringsKt.equals("no-cache", string, z11)) {
                                z12 = z11;
                                z14 = z12;
                            } else if (StringsKt.equals("no-store", string, z11)) {
                                z12 = z11;
                                z15 = z12;
                            } else {
                                if (StringsKt.equals("max-age", string, z11)) {
                                    nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                                } else if (StringsKt.equals("s-maxage", string, z11)) {
                                    nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                                } else if (StringsKt.equals("private", string, z11)) {
                                    z12 = z11;
                                    z16 = z12;
                                } else if (StringsKt.equals(TUIConstants.TUIPollPlugin.PLUGIN_POLL_ENABLE_PUBLIC, string, z11)) {
                                    z12 = z11;
                                    z17 = z12;
                                } else if (StringsKt.equals("must-revalidate", string, z11)) {
                                    z12 = z11;
                                    z18 = z12;
                                } else if (StringsKt.equals("max-stale", string, z11)) {
                                    nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                                } else if (StringsKt.equals("min-fresh", string, z11)) {
                                    nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                                } else if (StringsKt.equals("only-if-cached", string, z11)) {
                                    z12 = z11;
                                    z19 = z12;
                                } else if (StringsKt.equals("no-transform", string, z11)) {
                                    z12 = z11;
                                    z21 = z12;
                                } else if (StringsKt.equals("immutable", string, z11)) {
                                    z12 = z11;
                                    z22 = z12;
                                }
                                z12 = z11;
                            }
                            strValue = str;
                            size = i11;
                        } else {
                            i11 = size;
                        }
                        str = strValue;
                        iIndexOfElement = iIndexOfElement2 + 1;
                        string2 = null;
                        if (StringsKt.equals("no-cache", string, z11)) {
                            z12 = z11;
                            z14 = z12;
                        } else if (StringsKt.equals("no-store", string, z11)) {
                            z12 = z11;
                            z15 = z12;
                        } else {
                            if (StringsKt.equals("max-age", string, z11)) {
                                nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                            } else if (StringsKt.equals("s-maxage", string, z11)) {
                                nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                            } else if (StringsKt.equals("private", string, z11)) {
                                z12 = z11;
                                z16 = z12;
                            } else if (StringsKt.equals(TUIConstants.TUIPollPlugin.PLUGIN_POLL_ENABLE_PUBLIC, string, z11)) {
                                z12 = z11;
                                z17 = z12;
                            } else if (StringsKt.equals("must-revalidate", string, z11)) {
                                z12 = z11;
                                z18 = z12;
                            } else if (StringsKt.equals("max-stale", string, z11)) {
                                nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                            } else if (StringsKt.equals("min-fresh", string, z11)) {
                                nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                            } else if (StringsKt.equals("only-if-cached", string, z11)) {
                                z12 = z11;
                                z19 = z12;
                            } else if (StringsKt.equals("no-transform", string, z11)) {
                                z12 = z11;
                                z21 = z12;
                            } else if (StringsKt.equals("immutable", string, z11)) {
                                z12 = z11;
                                z22 = z12;
                            }
                            z12 = z11;
                        }
                        strValue = str;
                        size = i11;
                    }
                    i12++;
                    headers2 = headers;
                    z12 = z12;
                    size = size;
                } else {
                    if (StringsKt.equals(strName, HttpHeaders.PRAGMA, z12)) {
                    }
                    i12++;
                    headers2 = headers;
                    z12 = z12;
                    size = size;
                }
                z13 = false;
                iIndexOfElement = 0;
                while (iIndexOfElement < strValue.length()) {
                    iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                    String strSubstring4 = strValue.substring(iIndexOfElement, iIndexOfElement2);
                    z11 = z12;
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = StringsKt.trim((CharSequence) strSubstring4).toString();
                    if (iIndexOfElement2 != strValue.length()) {
                        i11 = size;
                        if (strValue.charAt(iIndexOfElement2) == ',') {
                        }
                        if (StringsKt.equals("no-cache", string, z11)) {
                            z12 = z11;
                            z14 = z12;
                        } else if (StringsKt.equals("no-store", string, z11)) {
                            z12 = z11;
                            z15 = z12;
                        } else {
                            if (StringsKt.equals("max-age", string, z11)) {
                                nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                            } else if (StringsKt.equals("s-maxage", string, z11)) {
                                nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                            } else if (StringsKt.equals("private", string, z11)) {
                                z12 = z11;
                                z16 = z12;
                            } else if (StringsKt.equals(TUIConstants.TUIPollPlugin.PLUGIN_POLL_ENABLE_PUBLIC, string, z11)) {
                                z12 = z11;
                                z17 = z12;
                            } else if (StringsKt.equals("must-revalidate", string, z11)) {
                                z12 = z11;
                                z18 = z12;
                            } else if (StringsKt.equals("max-stale", string, z11)) {
                                nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                            } else if (StringsKt.equals("min-fresh", string, z11)) {
                                nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                            } else if (StringsKt.equals("only-if-cached", string, z11)) {
                                z12 = z11;
                                z19 = z12;
                            } else if (StringsKt.equals("no-transform", string, z11)) {
                                z12 = z11;
                                z21 = z12;
                            } else if (StringsKt.equals("immutable", string, z11)) {
                                z12 = z11;
                                z22 = z12;
                            }
                            z12 = z11;
                        }
                        strValue = str;
                        size = i11;
                    } else {
                        i11 = size;
                    }
                    str = strValue;
                    iIndexOfElement = iIndexOfElement2 + 1;
                    string2 = null;
                    if (StringsKt.equals("no-cache", string, z11)) {
                        z12 = z11;
                        z14 = z12;
                    } else if (StringsKt.equals("no-store", string, z11)) {
                        z12 = z11;
                        z15 = z12;
                    } else {
                        if (StringsKt.equals("max-age", string, z11)) {
                            nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                        } else if (StringsKt.equals("s-maxage", string, z11)) {
                            nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                        } else if (StringsKt.equals("private", string, z11)) {
                            z12 = z11;
                            z16 = z12;
                        } else if (StringsKt.equals(TUIConstants.TUIPollPlugin.PLUGIN_POLL_ENABLE_PUBLIC, string, z11)) {
                            z12 = z11;
                            z17 = z12;
                        } else if (StringsKt.equals("must-revalidate", string, z11)) {
                            z12 = z11;
                            z18 = z12;
                        } else if (StringsKt.equals("max-stale", string, z11)) {
                            nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                        } else if (StringsKt.equals("min-fresh", string, z11)) {
                            nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                        } else if (StringsKt.equals("only-if-cached", string, z11)) {
                            z12 = z11;
                            z19 = z12;
                        } else if (StringsKt.equals("no-transform", string, z11)) {
                            z12 = z11;
                            z21 = z12;
                        } else if (StringsKt.equals("immutable", string, z11)) {
                            z12 = z11;
                            z22 = z12;
                        }
                        z12 = z11;
                    }
                    strValue = str;
                    size = i11;
                }
                i12++;
                headers2 = headers;
                z12 = z12;
                size = size;
            }
            return new CacheControl(z14, z15, nonNegativeInt, nonNegativeInt2, z16, z17, z18, nonNegativeInt3, nonNegativeInt4, z19, z21, z22, !z13 ? null : str2, null);
        }

        private final int indexOfElement(String str, String str2, int i11) {
            int length = str.length();
            while (i11 < length) {
                if (StringsKt.contains$default((CharSequence) str2, str.charAt(i11), false, 2, (Object) null)) {
                    return i11;
                }
                i11++;
            }
            return str.length();
        }
    }

    public /* synthetic */ CacheControl(boolean z11, boolean z12, int i11, int i12, boolean z13, boolean z14, boolean z15, int i13, int i14, boolean z16, boolean z17, boolean z18, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, z12, i11, i12, z13, z14, z15, i13, i14, z16, z17, z18, str);
    }

    private CacheControl(boolean z11, boolean z12, int i11, int i12, boolean z13, boolean z14, boolean z15, int i13, int i14, boolean z16, boolean z17, boolean z18, String str) {
        this.noCache = z11;
        this.noStore = z12;
        this.maxAgeSeconds = i11;
        this.sMaxAgeSeconds = i12;
        this.isPrivate = z13;
        this.isPublic = z14;
        this.mustRevalidate = z15;
        this.maxStaleSeconds = i13;
        this.minFreshSeconds = i14;
        this.onlyIfCached = z16;
        this.noTransform = z17;
        this.immutable = z18;
        this.headerValue = str;
    }

    @JvmStatic
    @NotNull
    public static final CacheControl parse(@NotNull Headers headers) {
        return INSTANCE.parse(headers);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "immutable", imports = {}))
    @JvmName(name = "-deprecated_immutable")
    /* JADX INFO: renamed from: -deprecated_immutable, reason: not valid java name and from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "maxAgeSeconds", imports = {}))
    @JvmName(name = "-deprecated_maxAgeSeconds")
    /* JADX INFO: renamed from: -deprecated_maxAgeSeconds, reason: not valid java name and from getter */
    public final int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "maxStaleSeconds", imports = {}))
    @JvmName(name = "-deprecated_maxStaleSeconds")
    /* JADX INFO: renamed from: -deprecated_maxStaleSeconds, reason: not valid java name and from getter */
    public final int getMaxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "minFreshSeconds", imports = {}))
    @JvmName(name = "-deprecated_minFreshSeconds")
    /* JADX INFO: renamed from: -deprecated_minFreshSeconds, reason: not valid java name and from getter */
    public final int getMinFreshSeconds() {
        return this.minFreshSeconds;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "mustRevalidate", imports = {}))
    @JvmName(name = "-deprecated_mustRevalidate")
    /* JADX INFO: renamed from: -deprecated_mustRevalidate, reason: not valid java name and from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noCache", imports = {}))
    @JvmName(name = "-deprecated_noCache")
    /* JADX INFO: renamed from: -deprecated_noCache, reason: not valid java name and from getter */
    public final boolean getNoCache() {
        return this.noCache;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noStore", imports = {}))
    @JvmName(name = "-deprecated_noStore")
    /* JADX INFO: renamed from: -deprecated_noStore, reason: not valid java name and from getter */
    public final boolean getNoStore() {
        return this.noStore;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noTransform", imports = {}))
    @JvmName(name = "-deprecated_noTransform")
    /* JADX INFO: renamed from: -deprecated_noTransform, reason: not valid java name and from getter */
    public final boolean getNoTransform() {
        return this.noTransform;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "onlyIfCached", imports = {}))
    @JvmName(name = "-deprecated_onlyIfCached")
    /* JADX INFO: renamed from: -deprecated_onlyIfCached, reason: not valid java name and from getter */
    public final boolean getOnlyIfCached() {
        return this.onlyIfCached;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sMaxAgeSeconds", imports = {}))
    @JvmName(name = "-deprecated_sMaxAgeSeconds")
    /* JADX INFO: renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name and from getter */
    public final int getSMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @JvmName(name = "immutable")
    public final boolean immutable() {
        return this.immutable;
    }

    /* JADX INFO: renamed from: isPrivate, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    /* JADX INFO: renamed from: isPublic, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    @JvmName(name = "maxAgeSeconds")
    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @JvmName(name = "maxStaleSeconds")
    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @JvmName(name = "minFreshSeconds")
    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @JvmName(name = "mustRevalidate")
    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    @JvmName(name = "noCache")
    public final boolean noCache() {
        return this.noCache;
    }

    @JvmName(name = "noStore")
    public final boolean noStore() {
        return this.noStore;
    }

    @JvmName(name = "noTransform")
    public final boolean noTransform() {
        return this.noTransform;
    }

    @JvmName(name = "onlyIfCached")
    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    @JvmName(name = "sMaxAgeSeconds")
    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @NotNull
    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.noCache) {
            sb2.append("no-cache, ");
        }
        if (this.noStore) {
            sb2.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb2.append("max-age=");
            sb2.append(this.maxAgeSeconds);
            sb2.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.sMaxAgeSeconds);
            sb2.append(", ");
        }
        if (this.isPrivate) {
            sb2.append("private, ");
        }
        if (this.isPublic) {
            sb2.append("public, ");
        }
        if (this.mustRevalidate) {
            sb2.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb2.append("max-stale=");
            sb2.append(this.maxStaleSeconds);
            sb2.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.minFreshSeconds);
            sb2.append(", ");
        }
        if (this.onlyIfCached) {
            sb2.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb2.append("no-transform, ");
        }
        if (this.immutable) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = string;
        return string;
    }
}
