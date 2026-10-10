package okio;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tencent.bugly.proguard.C33978va;
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001.B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0000H\u0096\u0002J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\rH\u0087\u0002¢\u0006\u0002\b\"J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b\"J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0002\b\"J\u0013\u0010#\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020\u001eH\u0016J\u0006\u0010&\u001a\u00020\u0000J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\bJ\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\bJ\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\bJ\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020,J\b\u0010-\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001c¨\u0006/"}, m90084d2 = {"Lokio/Path;", "", "bytes", "Lokio/ByteString;", "(Lokio/ByteString;)V", "getBytes$okio", "()Lokio/ByteString;", "isAbsolute", "", "()Z", "isRelative", "isRoot", "name", "", "()Ljava/lang/String;", "nameBytes", "parent", "()Lokio/Path;", "root", "getRoot", "segments", "", "getSegments", "()Ljava/util/List;", "segmentsBytes", "getSegmentsBytes", "volumeLetter", "", "()Ljava/lang/Character;", "compareTo", "", "other", TtmlNode.TAG_DIV, "child", "resolve", "equals", "", "hashCode", "normalized", "relativeTo", "normalize", "toFile", "Ljava/io/File;", "toNioPath", "Ljava/nio/file/Path;", "toString", "Companion", "okio"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/Path\n+ 2 Path.kt\nokio/internal/-Path\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n45#2,3:133\n53#2,28:136\n59#2,22:168\n112#2:190\n117#2:191\n122#2,6:192\n139#2,5:198\n149#2:203\n154#2,25:204\n194#2:229\n199#2,11:230\n204#2,6:241\n199#2,11:247\n204#2,6:258\n228#2,36:264\n268#2:300\n282#2:301\n287#2:302\n292#2:303\n297#2:304\n1549#3:164\n1620#3,3:165\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/Path\n*L\n44#1:133,3\n47#1:136,28\n50#1:168,22\n53#1:190\n56#1:191\n60#1:192,6\n64#1:198,5\n68#1:203\n72#1:204,25\n75#1:229\n78#1:230,11\n81#1:241,6\n87#1:247,11\n90#1:258,6\n95#1:264,36\n97#1:300\n104#1:301\n106#1:302\n108#1:303\n110#1:304\n47#1:164\n47#1:165,3\n*E\n"})
public final class Path implements Comparable<Path> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final String DIRECTORY_SEPARATOR;

    @NotNull
    private final ByteString bytes;

    /* JADX INFO: compiled from: Path.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\f\u001a\u00020\u0006*\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lokio/Path$Companion;", "", "()V", "DIRECTORY_SEPARATOR", "", "toOkioPath", "Lokio/Path;", "Ljava/io/File;", "normalize", "", "get", "Ljava/nio/file/Path;", "toPath", "okio"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Path get$default(Companion companion, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return companion.get(str, z11);
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        @JvmOverloads
        public final Path get(@NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            return get$default(this, file, false, 1, (Object) null);
        }

        private Companion() {
        }

        public static /* synthetic */ Path get$default(Companion companion, File file, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return companion.get(file, z11);
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        @JvmOverloads
        public final Path get(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return get$default(this, str, false, 1, (Object) null);
        }

        public static /* synthetic */ Path get$default(Companion companion, java.nio.file.Path path, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return companion.get(path, z11);
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        @JvmOverloads
        public final Path get(@NotNull java.nio.file.Path path) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            return get$default(this, path, false, 1, (Object) null);
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        @JvmOverloads
        public final Path get(@NotNull String str, boolean z11) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return okio.internal.Path.commonToPath(str, z11);
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        @JvmOverloads
        public final Path get(@NotNull File file, boolean z11) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            String string = file.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return get(string, z11);
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        @JvmOverloads
        public final Path get(@NotNull java.nio.file.Path path, boolean z11) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            return get(path.toString(), z11);
        }
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    @JvmOverloads
    public static final Path get(@NotNull File file) {
        return INSTANCE.get(file);
    }

    public static /* synthetic */ Path resolve$default(Path path, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return path.resolve(str, z11);
    }

    @JvmName(name = "resolve")
    @NotNull
    public final Path resolve(@NotNull Path child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, child, false);
    }

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        DIRECTORY_SEPARATOR = separator;
    }

    public Path(@NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.bytes = bytes;
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    @JvmOverloads
    public static final Path get(@NotNull File file, boolean z11) {
        return INSTANCE.get(file, z11);
    }

    public static /* synthetic */ Path resolve$default(Path path, ByteString byteString, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return path.resolve(byteString, z11);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Path other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return getBytes().compareTo(other.getBytes());
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof Path) && Intrinsics.areEqual(((Path) other).getBytes(), getBytes());
    }

    @NotNull
    /* JADX INFO: renamed from: getBytes$okio, reason: from getter */
    public final ByteString getBytes() {
        return this.bytes;
    }

    @NotNull
    public final List<String> getSegments() {
        ArrayList arrayList = new ArrayList();
        int iRootLength = okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes().size() && getBytes().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes().size();
        int i11 = iRootLength;
        while (iRootLength < size) {
            if (getBytes().getByte(iRootLength) == 47 || getBytes().getByte(iRootLength) == 92) {
                arrayList.add(getBytes().substring(i11, iRootLength));
                i11 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i11 < getBytes().size()) {
            arrayList.add(getBytes().substring(i11, getBytes().size()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ByteString) it.next()).utf8());
        }
        return arrayList2;
    }

    @NotNull
    public final List<ByteString> getSegmentsBytes() {
        ArrayList arrayList = new ArrayList();
        int iRootLength = okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes().size() && getBytes().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes().size();
        int i11 = iRootLength;
        while (iRootLength < size) {
            if (getBytes().getByte(iRootLength) == 47 || getBytes().getByte(iRootLength) == 92) {
                arrayList.add(getBytes().substring(i11, iRootLength));
                i11 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i11 < getBytes().size()) {
            arrayList.add(getBytes().substring(i11, getBytes().size()));
        }
        return arrayList;
    }

    @NotNull
    public final Path normalized() {
        return INSTANCE.get(toString(), true);
    }

    @NotNull
    public final Path relativeTo(@NotNull Path other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.areEqual(getRoot(), other.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List<ByteString> segmentsBytes = getSegmentsBytes();
        List<ByteString> segmentsBytes2 = other.getSegmentsBytes();
        int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i11 = 0;
        while (i11 < iMin && Intrinsics.areEqual(segmentsBytes.get(i11), segmentsBytes2.get(i11))) {
            i11++;
        }
        if (i11 == iMin && getBytes().size() == other.getBytes().size()) {
            return Companion.get$default(INSTANCE, C33978va.f72339h, false, 1, (Object) null);
        }
        if (segmentsBytes2.subList(i11, segmentsBytes2.size()).indexOf(okio.internal.Path.DOT_DOT) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        Buffer buffer = new Buffer();
        ByteString slash = okio.internal.Path.getSlash(other);
        if (slash == null && (slash = okio.internal.Path.getSlash(this)) == null) {
            slash = okio.internal.Path.toSlash(DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i12 = i11; i12 < size; i12++) {
            buffer.write(okio.internal.Path.DOT_DOT);
            buffer.write(slash);
        }
        int size2 = segmentsBytes.size();
        while (i11 < size2) {
            buffer.write(segmentsBytes.get(i11));
            buffer.write(slash);
            i11++;
        }
        return okio.internal.Path.toPath(buffer, false);
    }

    @NotNull
    public final Path resolve(@NotNull Path child, boolean normalize) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, child, normalize);
    }

    @NotNull
    public final File toFile() {
        return new File(toString());
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    @JvmOverloads
    public static final Path get(@NotNull String str) {
        return INSTANCE.get(str);
    }

    public static /* synthetic */ Path resolve$default(Path path, Path path2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return path.resolve(path2, z11);
    }

    @Nullable
    public final Path getRoot() {
        int iRootLength = okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            return null;
        }
        return new Path(getBytes().substring(0, iRootLength));
    }

    public int hashCode() {
        return getBytes().hashCode();
    }

    public final boolean isAbsolute() {
        if (okio.internal.Path.rootLength(this) != -1) {
            return true;
        }
        return false;
    }

    public final boolean isRelative() {
        if (okio.internal.Path.rootLength(this) == -1) {
            return true;
        }
        return false;
    }

    public final boolean isRoot() {
        if (okio.internal.Path.rootLength(this) == getBytes().size()) {
            return true;
        }
        return false;
    }

    @JvmName(name = "name")
    @NotNull
    public final String name() {
        return nameBytes().utf8();
    }

    @JvmName(name = "nameBytes")
    @NotNull
    public final ByteString nameBytes() {
        int indexOfLastSlash = okio.internal.Path.getIndexOfLastSlash(this);
        if (indexOfLastSlash != -1) {
            return ByteString.substring$default(getBytes(), indexOfLastSlash + 1, 0, 2, null);
        }
        if (volumeLetter() != null && getBytes().size() == 2) {
            return ByteString.EMPTY;
        }
        return getBytes();
    }

    @JvmName(name = "parent")
    @Nullable
    public final Path parent() {
        if (!Intrinsics.areEqual(getBytes(), okio.internal.Path.DOT) && !Intrinsics.areEqual(getBytes(), okio.internal.Path.SLASH) && !Intrinsics.areEqual(getBytes(), okio.internal.Path.BACKSLASH) && !okio.internal.Path.lastSegmentIsDotDot(this)) {
            int indexOfLastSlash = okio.internal.Path.getIndexOfLastSlash(this);
            if (indexOfLastSlash == 2 && volumeLetter() != null) {
                if (getBytes().size() == 3) {
                    return null;
                }
                return new Path(ByteString.substring$default(getBytes(), 0, 3, 1, null));
            }
            if (indexOfLastSlash == 1 && getBytes().startsWith(okio.internal.Path.BACKSLASH)) {
                return null;
            }
            if (indexOfLastSlash == -1 && volumeLetter() != null) {
                if (getBytes().size() == 2) {
                    return null;
                }
                return new Path(ByteString.substring$default(getBytes(), 0, 2, 1, null));
            }
            if (indexOfLastSlash == -1) {
                return new Path(okio.internal.Path.DOT);
            }
            if (indexOfLastSlash == 0) {
                return new Path(ByteString.substring$default(getBytes(), 0, 1, 1, null));
            }
            return new Path(ByteString.substring$default(getBytes(), 0, indexOfLastSlash, 1, null));
        }
        return null;
    }

    @JvmName(name = "resolve")
    @NotNull
    public final Path resolve(@NotNull String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().writeUtf8(child), false), false);
    }

    @NotNull
    public final java.nio.file.Path toNioPath() {
        java.nio.file.Path path = Paths.get(toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    @NotNull
    public String toString() {
        return getBytes().utf8();
    }

    @JvmName(name = "volumeLetter")
    @Nullable
    public final Character volumeLetter() {
        if (ByteString.indexOf$default(getBytes(), okio.internal.Path.SLASH, 0, 2, (Object) null) != -1 || getBytes().size() < 2 || getBytes().getByte(1) != 58) {
            return null;
        }
        char c11 = (char) getBytes().getByte(0);
        if (('a' > c11 || c11 >= '{') && ('A' > c11 || c11 >= '[')) {
            return null;
        }
        return Character.valueOf(c11);
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    @JvmOverloads
    public static final Path get(@NotNull String str, boolean z11) {
        return INSTANCE.get(str, z11);
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    @JvmOverloads
    public static final Path get(@NotNull java.nio.file.Path path) {
        return INSTANCE.get(path);
    }

    @JvmName(name = "resolve")
    @NotNull
    public final Path resolve(@NotNull ByteString child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().write(child), false), false);
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    @JvmOverloads
    public static final Path get(@NotNull java.nio.file.Path path, boolean z11) {
        return INSTANCE.get(path, z11);
    }

    @NotNull
    public final Path resolve(@NotNull String child, boolean normalize) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().writeUtf8(child), false), normalize);
    }

    @NotNull
    public final Path resolve(@NotNull ByteString child, boolean normalize) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().write(child), false), normalize);
    }
}
