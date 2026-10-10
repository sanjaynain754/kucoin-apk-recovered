package com.tencent.liteav.transcriber;

import com.tencent.liteav.base.annotations.JNINamespace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::manager")
public class AITranscriberManagerImpl implements AITranscriberManager {
    private static final String TAG = "AITranscriberManagerImpl";
    private TranscriberListenerWrapper mListenerDispatcher = new TranscriberListenerWrapper();
    private long mNativeAITranscriberManagerJni;

    public static class TranscriberListenerWrapper {

        /* JADX INFO: renamed from: a */
        private final List<AITranscriberManager.AITranscriberListener> f73668a = new ArrayList();

        /* JADX INFO: renamed from: a */
        public final boolean m76183a(AITranscriberManager.AITranscriberListener aITranscriberListener) {
            boolean z11;
            if (aITranscriberListener == null) {
                return false;
            }
            synchronized (this) {
                try {
                    if (!this.f73668a.contains(aITranscriberListener)) {
                        this.f73668a.add(aITranscriberListener);
                    }
                    z11 = this.f73668a.size() > 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z11;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m76184b(AITranscriberManager.AITranscriberListener aITranscriberListener) {
            boolean z11;
            synchronized (this) {
                this.f73668a.remove(aITranscriberListener);
                z11 = this.f73668a.size() == 0;
            }
            return z11;
        }

        public void onRealtimeTranscriberError(String str, String str2, int i11, String str3) {
            ArrayList<AITranscriberManager.AITranscriberListener> arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f73668a);
            }
            for (AITranscriberManager.AITranscriberListener aITranscriberListener : arrayList) {
                if (aITranscriberListener != null) {
                    aITranscriberListener.onRealtimeTranscriberError(str, str2, i11, str3);
                }
            }
        }

        public void onRealtimeTranscriberStarted(String str, String str2) {
            ArrayList<AITranscriberManager.AITranscriberListener> arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f73668a);
            }
            for (AITranscriberManager.AITranscriberListener aITranscriberListener : arrayList) {
                if (aITranscriberListener != null) {
                    aITranscriberListener.onRealtimeTranscriberStarted(str, str2);
                }
            }
        }

        public void onRealtimeTranscriberStopped(String str, String str2, int i11) {
            ArrayList<AITranscriberManager.AITranscriberListener> arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f73668a);
            }
            for (AITranscriberManager.AITranscriberListener aITranscriberListener : arrayList) {
                if (aITranscriberListener != null) {
                    aITranscriberListener.onRealtimeTranscriberStopped(str, str2, i11);
                }
            }
        }

        public void onReceiveTranscriberMessage(String str, AITranscriberManager.TranscriberMessage transcriberMessage) {
            ArrayList<AITranscriberManager.AITranscriberListener> arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f73668a);
            }
            for (AITranscriberManager.AITranscriberListener aITranscriberListener : arrayList) {
                if (aITranscriberListener != null) {
                    aITranscriberListener.onReceiveTranscriberMessage(str, transcriberMessage);
                }
            }
        }
    }

    public static class TranscriberMessageWrapper {
        public static AITranscriberManager.TranscriberMessage constructor() {
            return new AITranscriberManager.TranscriberMessage();
        }

        public static void putTranslationText(AITranscriberManager.TranscriberMessage transcriberMessage, String str, String str2) {
            if (transcriberMessage.translationTexts == null) {
                transcriberMessage.translationTexts = new HashMap();
            }
            transcriberMessage.translationTexts.put(str, str2);
        }

        public static void setIsCompleted(AITranscriberManager.TranscriberMessage transcriberMessage, boolean z11) {
            transcriberMessage.isCompleted = z11;
        }

        public static void setSegmentId(AITranscriberManager.TranscriberMessage transcriberMessage, String str) {
            transcriberMessage.segmentId = str;
        }

        public static void setSourceText(AITranscriberManager.TranscriberMessage transcriberMessage, String str) {
            transcriberMessage.sourceText = str;
        }

        public static void setSpeakerUserId(AITranscriberManager.TranscriberMessage transcriberMessage, String str) {
            transcriberMessage.speakerUserId = str;
        }

        public static void setTimestamp(AITranscriberManager.TranscriberMessage transcriberMessage, long j11) {
            transcriberMessage.timestamp = j11;
        }
    }

    public static class TranscriberParamsWrapper {

        /* JADX INFO: renamed from: a */
        private AITranscriberManager.TranscriberParams f73669a;

        public String getSourceLanguage() {
            return this.f73669a.sourceLanguage;
        }

        public String getTranscriberRobotId() {
            return this.f73669a.transcriberRobotId;
        }

        public String[] getTranslationLanguages() {
            List<String> list = this.f73669a.translationLanguages;
            if (list == null) {
                return null;
            }
            return (String[]) list.toArray(new String[0]);
        }

        public String[] getUserIdsToTranscribe() {
            List<String> list = this.f73669a.userIdsToTranscribe;
            if (list == null) {
                return null;
            }
            return (String[]) list.toArray(new String[0]);
        }

        public TranscriberParamsWrapper(AITranscriberManager.TranscriberParams transcriberParams) {
            this.f73669a = transcriberParams;
        }
    }

    private static native void nativeDestroy(long j11);

    private static native void nativePauseReceivingMessage(long j11);

    private static native void nativeResumeReceivingMessage(long j11);

    private static native void nativeSetListener(long j11, TranscriberListenerWrapper transcriberListenerWrapper);

    private static native void nativeStartRealtimeTranscriber(long j11, TranscriberParamsWrapper transcriberParamsWrapper);

    private static native void nativeStopRealtimeTranscriber(long j11, String str);

    @Override // com.tencent.liteav.transcriber.AITranscriberManager
    public void addListener(AITranscriberManager.AITranscriberListener aITranscriberListener) {
        if (aITranscriberListener != null && this.mListenerDispatcher.m76183a(aITranscriberListener)) {
            long j11 = this.mNativeAITranscriberManagerJni;
            if (j11 != 0) {
                nativeSetListener(j11, this.mListenerDispatcher);
            }
        }
    }

    @Override // com.tencent.liteav.transcriber.AITranscriberManager
    public void pauseReceivingMessage() {
        long j11 = this.mNativeAITranscriberManagerJni;
        if (j11 != 0) {
            nativePauseReceivingMessage(j11);
        }
    }

    @Override // com.tencent.liteav.transcriber.AITranscriberManager
    public void removeListener(AITranscriberManager.AITranscriberListener aITranscriberListener) {
        if (aITranscriberListener != null && this.mListenerDispatcher.m76184b(aITranscriberListener)) {
            long j11 = this.mNativeAITranscriberManagerJni;
            if (j11 != 0) {
                nativeSetListener(j11, null);
            }
        }
    }

    @Override // com.tencent.liteav.transcriber.AITranscriberManager
    public void resumeReceivingMessage() {
        long j11 = this.mNativeAITranscriberManagerJni;
        if (j11 != 0) {
            nativeResumeReceivingMessage(j11);
        }
    }

    @Override // com.tencent.liteav.transcriber.AITranscriberManager
    public void startRealtimeTranscriber(AITranscriberManager.TranscriberParams transcriberParams) {
        long j11 = this.mNativeAITranscriberManagerJni;
        if (j11 == 0 || transcriberParams == null) {
            return;
        }
        nativeStartRealtimeTranscriber(j11, new TranscriberParamsWrapper(transcriberParams));
    }

    @Override // com.tencent.liteav.transcriber.AITranscriberManager
    public void stopRealtimeTranscriber(String str) {
        long j11 = this.mNativeAITranscriberManagerJni;
        if (j11 == 0 || str == null) {
            return;
        }
        nativeStopRealtimeTranscriber(j11, str);
    }

    public AITranscriberManagerImpl(long j11) {
        this.mNativeAITranscriberManagerJni = 0L;
        this.mNativeAITranscriberManagerJni = j11;
    }

    public void finalize() throws Throwable {
        super.finalize();
        long j11 = this.mNativeAITranscriberManagerJni;
        if (j11 != 0) {
            nativeDestroy(j11);
            this.mNativeAITranscriberManagerJni = 0L;
        }
    }
}
