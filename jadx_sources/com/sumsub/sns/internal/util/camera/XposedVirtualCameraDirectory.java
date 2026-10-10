package com.sumsub.sns.internal.util.camera;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.p407io.FilesKt;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&j\u0002\b\u0004j\u0002\b\u0005¨\u0006\n"}, m90084d2 = {"Lcom/sumsub/sns/internal/util/camera/XposedVirtualCameraDirectory;", "", "<init>", "(Ljava/lang/String;I)V", "INTERNAL", "EXTERNAL", "getDirectory", "Ljava/io/File;", "context", "Landroid/content/Context;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class XposedVirtualCameraDirectory {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ XposedVirtualCameraDirectory[] $VALUES;
    public static final XposedVirtualCameraDirectory INTERNAL = new XposedVirtualCameraDirectory() { // from class: com.sumsub.sns.internal.util.camera.f
        @Override // com.sumsub.sns.internal.util.camera.XposedVirtualCameraDirectory
        public final File getDirectory(Context context) {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                return FilesKt.resolve(externalFilesDir, "Camera1");
            }
            return null;
        }
    };
    public static final XposedVirtualCameraDirectory EXTERNAL = new XposedVirtualCameraDirectory() { // from class: com.sumsub.sns.internal.util.camera.e
        @Override // com.sumsub.sns.internal.util.camera.XposedVirtualCameraDirectory
        public final File getDirectory(Context context) {
            return FilesKt.resolve(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera1");
        }
    };

    public /* synthetic */ XposedVirtualCameraDirectory(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11);
    }

    @Nullable
    public abstract File getDirectory(@NotNull Context context);

    private static final /* synthetic */ XposedVirtualCameraDirectory[] $values() {
        return new XposedVirtualCameraDirectory[]{INTERNAL, EXTERNAL};
    }

    static {
        XposedVirtualCameraDirectory[] xposedVirtualCameraDirectoryArr$values = $values();
        $VALUES = xposedVirtualCameraDirectoryArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(xposedVirtualCameraDirectoryArr$values);
    }

    private XposedVirtualCameraDirectory(String str, int i11) {
        super(str, i11);
    }

    @NotNull
    public static EnumEntries<XposedVirtualCameraDirectory> getEntries() {
        return $ENTRIES;
    }

    public static XposedVirtualCameraDirectory valueOf(String str) {
        return (XposedVirtualCameraDirectory) Enum.valueOf(XposedVirtualCameraDirectory.class, str);
    }

    public static XposedVirtualCameraDirectory[] values() {
        return (XposedVirtualCameraDirectory[]) $VALUES.clone();
    }
}
