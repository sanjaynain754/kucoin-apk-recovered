package com.facebook;

import com.facebook.FacebookException;
import com.facebook.internal.FeatureManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Arrays;
import java.util.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p489o6.C42982d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FacebookException.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\u0011B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u0011\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B)\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB\u0011\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0005H\u0016¨\u0006\u0012"}, m90084d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "message", "", "(Ljava/lang/String;)V", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "toString", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public class FacebookException extends RuntimeException {
    public static final long serialVersionUID = 1;

    public FacebookException() {
    }

    public FacebookException(@Nullable final String str) {
        super(str);
        Random random = new Random();
        if (str == null || !C5501a.m7768D() || random.nextInt(100) <= 50) {
            return;
        }
        FeatureManager.m9936a(FeatureManager.Feature.ErrorReport, new FeatureManager.InterfaceC5749a() { // from class: z2.e
            @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
            /* JADX INFO: renamed from: a */
            public final void mo81a(boolean z11) {
                FacebookException.m7630b(str, z11);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static final void m7630b(String str, boolean z11) {
        if (z11) {
            try {
                C42982d.m94393g(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        String message = getMessage();
        if (message == null) {
            return "";
        }
        return message;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FacebookException(@Nullable String str, @NotNull Object... args) {
        String str2;
        Intrinsics.checkNotNullParameter(args, "args");
        if (str != null) {
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str2, "format(this, *args)");
        } else {
            str2 = null;
        }
        this(str2);
    }

    public FacebookException(@Nullable String str, @Nullable Throwable th2) {
        super(str, th2);
    }

    public FacebookException(@Nullable Throwable th2) {
        super(th2);
    }
}
