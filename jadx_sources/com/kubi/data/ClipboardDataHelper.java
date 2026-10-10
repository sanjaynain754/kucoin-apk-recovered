package com.kubi.data;

import com.kubi.sdk.site.C24128a;
import com.kubi.utils.storage.StorageType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.data.g, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ClipboardDataHelper.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/data/ClipboardDataHelper;", "", "<init>", "()V", "CATE", "", "KEY_CLIPBOARD_ACCESS_SWITCH_STATE", "Lcom/kubi/utils/storage/StorageId;", "", "isAccessOpen", "setAccessState", "", "access", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nClipboardDataHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipboardDataHelper.kt\ncom/kubi/data/ClipboardDataHelper\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,32:1\n136#2:33\n126#2,2:34\n*S KotlinDebug\n*F\n+ 1 ClipboardDataHelper.kt\ncom/kubi/data/ClipboardDataHelper\n*L\n24#1:33\n31#1:34,2\n*E\n"})
public final class ClipboardDataHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ClipboardDataHelper f21479a = new ClipboardDataHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<Boolean> f21480b = new StorageId<>("ClipboardDataHelper", "key_clipboard_access_switch_state", StorageType.Shared, false, 8, null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m23650a() {
        return C46392a.m102322d(f21480b, true) && C24128a.m58028a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m23651b(boolean z11) {
        C46392a.m102328k(f21480b, z11);
    }
}
