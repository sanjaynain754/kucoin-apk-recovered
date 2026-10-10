package p563qk;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.C5258a;
import com.kubi.kc_hardware_service.hardware_service_index.ClipboardContentFormat;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qk.a */
/* JADX INFO: compiled from: ClipboardHelper.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lqk/a;", "", "<init>", "()V", "Lcom/kubi/kc_hardware_service/hardware_service_index/ClipboardContentFormat;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "b", "(Lcom/kubi/kc_hardware_service/hardware_service_index/ClipboardContentFormat;)Ljava/lang/CharSequence;", "", "text", "", "c", "(Ljava/lang/String;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "hardware_service_index_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C43768a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43768a f96779a = new C43768a();

    /* JADX INFO: renamed from: c */
    public final void m96435c(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Object systemService = C5258a.m6125h().getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text label?", text));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m96433a() {
        ClipDescription primaryClipDescription;
        Object systemService = C5258a.m6125h().getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        if (!clipboardManager.hasPrimaryClip() || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null) {
            return false;
        }
        return primaryClipDescription.hasMimeType("text/*");
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final CharSequence m96434b(@Nullable ClipboardContentFormat format) {
        Activity activityM6125h = C5258a.m6125h();
        Object systemService = activityM6125h.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip == null) {
                return null;
            }
            if (format != null && format != ClipboardContentFormat.PLAIN_TEXT) {
                return null;
            }
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            CharSequence text = itemAt.getText();
            if (text == null) {
                try {
                    Uri uri = itemAt.getUri();
                    if (uri == null || !Intrinsics.areEqual(uri.getScheme(), "content")) {
                        return null;
                    }
                    AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = activityM6125h.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                    CharSequence charSequenceCoerceToText = itemAt.coerceToText(activityM6125h);
                    if (assetFileDescriptorOpenTypedAssetFileDescriptor != null) {
                        try {
                            assetFileDescriptorOpenTypedAssetFileDescriptor.close();
                            return charSequenceCoerceToText;
                        } catch (IOException unused) {
                            return charSequenceCoerceToText;
                        }
                    }
                    return charSequenceCoerceToText;
                } catch (IOException unused2) {
                    return text;
                }
            }
            return text;
        } catch (FileNotFoundException | IOException | SecurityException unused3) {
            return null;
        }
    }
}
