package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.internal.C5760c;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p357j3.C40258g;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppEventDiskStore.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u0010"}, m90084d2 = {"Lcom/facebook/appevents/AppEventDiskStore;", "", "<init>", "()V", "Lcom/facebook/appevents/PersistedEvents;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/facebook/appevents/PersistedEvents;", "eventsToPersist", "", "b", "(Lcom/facebook/appevents/PersistedEvents;)V", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "MovedClassObjectInputStream", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AppEventDiskStore {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AppEventDiskStore f7644a = new AppEventDiskStore();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = AppEventDiskStore.class.getName();

    /* JADX INFO: compiled from: AppEventDiskStore.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/appevents/AppEventDiskStore$MovedClassObjectInputStream;", "Ljava/io/ObjectInputStream;", "Ljava/io/InputStream;", "inputStream", "<init>", "(Ljava/io/InputStream;)V", "Ljava/io/ObjectStreamClass;", "readClassDescriptor", "()Ljava/io/ObjectStreamClass;", "b", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class MovedClassObjectInputStream extends ObjectInputStream {
        public MovedClassObjectInputStream(@Nullable InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        @NotNull
        public ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
            ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            if (Intrinsics.areEqual(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                resultClassDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            } else if (Intrinsics.areEqual(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                resultClassDescriptor = ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class);
            }
            Intrinsics.checkNotNullExpressionValue(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009a A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0003, B:8:0x002b, B:9:0x002e, B:44:0x009a, B:14:0x003c, B:32:0x006f, B:33:0x0072, B:37:0x0084, B:36:0x007d, B:26:0x0059, B:27:0x005c, B:30:0x0067, B:31:0x006b, B:38:0x0085, B:39:0x0088, B:42:0x0093), top: B:57:0x0003, inners: #2, #3, #9, #10 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final synchronized PersistedEvents m7838a() {
        PersistedEvents persistedEvents;
        ?? r11;
        Throwable th2;
        MovedClassObjectInputStream movedClassObjectInputStream;
        String str;
        String str2;
        Object obj;
        Object obj2;
        C40258g.m88607b();
        ?? M7799m = C5501a.m7799m();
        persistedEvents = null;
        try {
            try {
                FileInputStream fileInputStreamOpenFileInput = M7799m.openFileInput("AppEventsLogger.persistedevents");
                Intrinsics.checkNotNullExpressionValue(fileInputStreamOpenFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                movedClassObjectInputStream = new MovedClassObjectInputStream(new BufferedInputStream(fileInputStreamOpenFileInput));
                try {
                    Object object = movedClassObjectInputStream.readObject();
                    Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
                    PersistedEvents persistedEvents2 = (PersistedEvents) object;
                    C5760c.m10071i(movedClassObjectInputStream);
                    try {
                        File fileStreamPath = M7799m.getFileStreamPath("AppEventsLogger.persistedevents");
                        fileStreamPath.delete();
                        obj2 = fileStreamPath;
                        obj = movedClassObjectInputStream;
                    } catch (Exception e11) {
                        Log.w(TAG, "Got unexpected exception when removing events file: ", e11);
                        obj2 = e11;
                        obj = "Got unexpected exception when removing events file: ";
                    }
                    persistedEvents = persistedEvents2;
                    M7799m = obj2;
                    r11 = obj;
                } catch (FileNotFoundException unused) {
                    C5760c.m10071i(movedClassObjectInputStream);
                    try {
                        M7799m.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e12) {
                        e = e12;
                        str = TAG;
                        str2 = "Got unexpected exception when removing events file: ";
                        Log.w(str, str2, e);
                    }
                    if (persistedEvents == null) {
                        persistedEvents = new PersistedEvents();
                    }
                    return persistedEvents;
                } catch (Exception e13) {
                    e = e13;
                    Log.w(TAG, "Got unexpected exception while reading events: ", e);
                    C5760c.m10071i(movedClassObjectInputStream);
                    try {
                        File fileStreamPath2 = M7799m.getFileStreamPath("AppEventsLogger.persistedevents");
                        fileStreamPath2.delete();
                        M7799m = fileStreamPath2;
                        r11 = movedClassObjectInputStream;
                    } catch (Exception e14) {
                        e = e14;
                        str = TAG;
                        str2 = "Got unexpected exception when removing events file: ";
                        Log.w(str, str2, e);
                    }
                }
            } catch (Throwable th3) {
                th2 = th3;
                C5760c.m10071i(r11);
                try {
                    M7799m.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception e15) {
                    Log.w(TAG, "Got unexpected exception when removing events file: ", e15);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused2) {
            movedClassObjectInputStream = null;
        } catch (Exception e16) {
            e = e16;
            movedClassObjectInputStream = null;
        } catch (Throwable th4) {
            r11 = 0;
            th2 = th4;
            C5760c.m10071i(r11);
            M7799m.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            throw th2;
        }
        if (persistedEvents == null) {
            persistedEvents = new PersistedEvents();
        }
        return persistedEvents;
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m7839b(@Nullable PersistedEvents eventsToPersist) {
        Context contextM7799m = C5501a.m7799m();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(contextM7799m.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(eventsToPersist);
                C5760c.m10071i(objectOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w(TAG, "Got unexpected exception while persisting events: ", th);
                    try {
                        contextM7799m.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                } finally {
                    C5760c.m10071i(objectOutputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
