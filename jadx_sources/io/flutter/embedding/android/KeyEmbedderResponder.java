package io.flutter.embedding.android;

import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.Log;
import io.flutter.plugin.common.BinaryMessenger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class KeyEmbedderResponder implements KeyboardManager.Responder {
    private static final String TAG = "KeyEmbedderResponder";

    @NonNull
    private final BinaryMessenger messenger;

    @NonNull
    private final HashMap<Long, Long> pressingRecords = new HashMap<>();

    @NonNull
    private final HashMap<Long, KeyboardMap.TogglingGoal> togglingGoals = new HashMap<>();

    @NonNull
    private final KeyboardManager.CharacterCombiner characterCombiner = new KeyboardManager.CharacterCombiner();

    /* JADX INFO: renamed from: io.flutter.embedding.android.KeyEmbedderResponder$1 */
    /* JADX INFO: loaded from: classes60.dex */
    public static /* synthetic */ class C387181 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$android$KeyData$Type;

        static {
            int[] iArr = new int[KeyData.Type.values().length];
            $SwitchMap$io$flutter$embedding$android$KeyData$Type = iArr;
            try {
                iArr[KeyData.Type.kDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$embedding$android$KeyData$Type[KeyData.Type.kUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$embedding$android$KeyData$Type[KeyData.Type.kRepeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m87488c(KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback, ByteBuffer byteBuffer) {
        Boolean boolValueOf = Boolean.FALSE;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            if (byteBuffer.capacity() != 0) {
                boolValueOf = Boolean.valueOf(byteBuffer.get() != 0);
            }
        } else {
            Log.m87483w(TAG, "A null reply was received when sending a key event to the framework.");
        }
        onKeyEventHandledCallback.onKeyEventHandled(boolValueOf.booleanValue());
    }

    private Long getLogicalKey(@NonNull KeyEvent keyEvent) {
        Long l11 = KeyboardMap.keyCodeToLogical.get(Long.valueOf(keyEvent.getKeyCode()));
        return l11 != null ? l11 : Long.valueOf(keyOfPlane(keyEvent.getKeyCode(), KeyboardMap.kAndroidPlane));
    }

    private void sendKeyEvent(KeyData keyData, final KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        this.messenger.send(KeyData.CHANNEL, keyData.toBytes(), onKeyEventHandledCallback == null ? null : new BinaryMessenger.BinaryReply() { // from class: io.flutter.embedding.android.m
            @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
            public final void reply(ByteBuffer byteBuffer) {
                KeyEmbedderResponder.m87488c(onKeyEventHandledCallback, byteBuffer);
            }
        });
    }

    private void synthesizeEvent(boolean z11, Long l11, Long l12, long j11) {
        KeyData keyData = new KeyData();
        keyData.timestamp = j11;
        keyData.type = z11 ? KeyData.Type.kDown : KeyData.Type.kUp;
        keyData.logicalKey = l11.longValue();
        keyData.physicalKey = l12.longValue();
        keyData.character = null;
        keyData.synthesized = true;
        keyData.deviceType = KeyData.DeviceType.kKeyboard;
        if (l12.longValue() != 0 && l11.longValue() != 0) {
            if (!z11) {
                l11 = null;
            }
            updatePressingState(l12, l11);
        }
        sendKeyEvent(keyData, null);
    }

    public Map<Long, Long> getPressedState() {
        return Collections.unmodifiableMap(this.pressingRecords);
    }

    public void synchronizePressingKey(KeyboardMap.PressingGoal pressingGoal, boolean z11, long j11, final long j12, final KeyEvent keyEvent, ArrayList<Runnable> arrayList) {
        KeyboardMap.KeyPair[] keyPairArr = pressingGoal.keys;
        boolean[] zArr = new boolean[keyPairArr.length];
        Boolean[] boolArr = new Boolean[keyPairArr.length];
        int i11 = 0;
        boolean z12 = false;
        while (true) {
            KeyboardMap.KeyPair[] keyPairArr2 = pressingGoal.keys;
            boolean z13 = true;
            if (i11 >= keyPairArr2.length) {
                break;
            }
            final KeyboardMap.KeyPair keyPair = keyPairArr2[i11];
            boolean zContainsKey = this.pressingRecords.containsKey(Long.valueOf(keyPair.physicalKey));
            zArr[i11] = zContainsKey;
            if (keyPair.logicalKey == j11) {
                int i12 = C387181.$SwitchMap$io$flutter$embedding$android$KeyData$Type[getEventType(keyEvent).ordinal()];
                if (i12 != 1) {
                    if (i12 == 2) {
                        boolArr[i11] = Boolean.valueOf(zArr[i11]);
                    } else if (i12 == 3) {
                        if (!z11) {
                            arrayList.add(new Runnable() { // from class: io.flutter.embedding.android.o
                                @Override // java.lang.Runnable
                                public final void run() {
                                    KeyEmbedderResponder.m87486a(this.f86740b, keyPair, j12, keyEvent);
                                }
                            });
                        }
                        boolArr[i11] = Boolean.valueOf(zArr[i11]);
                    }
                    i11++;
                } else {
                    boolArr[i11] = Boolean.FALSE;
                    if (!z11) {
                        arrayList.add(new Runnable() { // from class: io.flutter.embedding.android.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                KeyEmbedderResponder.m87487b(this.f86736b, keyPair, j12, keyEvent);
                            }
                        });
                    }
                }
            } else if (!z12 && !zContainsKey) {
                z13 = false;
            }
            z12 = z13;
            i11++;
        }
        if (z11) {
            for (int i13 = 0; i13 < pressingGoal.keys.length; i13++) {
                if (boolArr[i13] == null) {
                    if (z12) {
                        boolArr[i13] = Boolean.valueOf(zArr[i13]);
                    } else {
                        boolArr[i13] = Boolean.TRUE;
                        z12 = true;
                    }
                }
            }
            if (!z12) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i14 = 0; i14 < pressingGoal.keys.length; i14++) {
                if (boolArr[i14] == null) {
                    boolArr[i14] = Boolean.FALSE;
                }
            }
        }
        for (int i15 = 0; i15 < pressingGoal.keys.length; i15++) {
            if (zArr[i15] != boolArr[i15].booleanValue()) {
                KeyboardMap.KeyPair keyPair2 = pressingGoal.keys[i15];
                synthesizeEvent(boolArr[i15].booleanValue(), Long.valueOf(keyPair2.logicalKey), Long.valueOf(keyPair2.physicalKey), keyEvent.getEventTime());
            }
        }
    }

    public void synchronizeTogglingKey(KeyboardMap.TogglingGoal togglingGoal, boolean z11, long j11, KeyEvent keyEvent) {
        if (togglingGoal.logicalKey == j11 || togglingGoal.enabled == z11) {
            return;
        }
        boolean zContainsKey = this.pressingRecords.containsKey(Long.valueOf(togglingGoal.physicalKey));
        boolean z12 = !zContainsKey;
        if (!zContainsKey) {
            togglingGoal.enabled = !togglingGoal.enabled;
        }
        synthesizeEvent(z12, Long.valueOf(togglingGoal.logicalKey), Long.valueOf(togglingGoal.physicalKey), keyEvent.getEventTime());
        if (zContainsKey) {
            togglingGoal.enabled = !togglingGoal.enabled;
        }
        synthesizeEvent(zContainsKey, Long.valueOf(togglingGoal.logicalKey), Long.valueOf(togglingGoal.physicalKey), keyEvent.getEventTime());
    }

    public void updatePressingState(@NonNull Long l11, @Nullable Long l12) {
        if (l12 != null) {
            if (this.pressingRecords.put(l11, l12) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (this.pressingRecords.remove(l11) == null) {
            throw new AssertionError("The key was empty");
        }
    }

    public KeyEmbedderResponder(BinaryMessenger binaryMessenger) {
        this.messenger = binaryMessenger;
        for (KeyboardMap.TogglingGoal togglingGoal : KeyboardMap.getTogglingGoals()) {
            this.togglingGoals.put(Long.valueOf(togglingGoal.logicalKey), togglingGoal);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m87486a(KeyEmbedderResponder keyEmbedderResponder, KeyboardMap.KeyPair keyPair, long j11, KeyEvent keyEvent) {
        keyEmbedderResponder.getClass();
        keyEmbedderResponder.synthesizeEvent(false, Long.valueOf(keyPair.logicalKey), Long.valueOf(j11), keyEvent.getEventTime());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m87487b(KeyEmbedderResponder keyEmbedderResponder, KeyboardMap.KeyPair keyPair, long j11, KeyEvent keyEvent) {
        keyEmbedderResponder.getClass();
        keyEmbedderResponder.synthesizeEvent(false, Long.valueOf(keyPair.logicalKey), Long.valueOf(j11), keyEvent.getEventTime());
    }

    private static KeyData.Type getEventType(KeyEvent keyEvent) {
        boolean z11;
        if (keyEvent.getRepeatCount() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                return KeyData.Type.kUp;
            }
            throw new AssertionError("Unexpected event type");
        }
        if (z11) {
            return KeyData.Type.kRepeat;
        }
        return KeyData.Type.kDown;
    }

    private Long getPhysicalKey(@NonNull KeyEvent keyEvent) {
        long scanCode = keyEvent.getScanCode();
        if (scanCode == 0) {
            return Long.valueOf(keyOfPlane(keyEvent.getKeyCode(), KeyboardMap.kAndroidPlane));
        }
        Long l11 = KeyboardMap.scanCodeToPhysical.get(Long.valueOf(scanCode));
        if (l11 != null) {
            return l11;
        }
        return Long.valueOf(keyOfPlane(keyEvent.getScanCode(), KeyboardMap.kAndroidPlane));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:64:0x0102  */
    /* JADX WARN: Code duplicated, block: B:65:0x0107  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0111  */
    /* JADX WARN: Code duplicated, block: B:68:0x0116  */
    /* JADX WARN: Code duplicated, block: B:72:0x0141 A[LOOP:2: B:70:0x013b->B:72:0x0141, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x00b1, please report this as an issue */
    private boolean handleEventImpl(@NonNull KeyEvent keyEvent, @NonNull KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        boolean z11;
        Long l11;
        KeyData.Type type;
        String str;
        KeyData keyData;
        int source;
        Iterator<Runnable> it;
        KeyboardMap.TogglingGoal togglingGoal;
        char cCharValue;
        boolean z12;
        boolean z13;
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            return false;
        }
        Long physicalKey = getPhysicalKey(keyEvent);
        Long logicalKey = getLogicalKey(keyEvent);
        ArrayList<Runnable> arrayList = new ArrayList<>();
        for (KeyboardMap.PressingGoal pressingGoal : KeyboardMap.pressingGoals) {
            if ((keyEvent.getMetaState() & pressingGoal.mask) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            synchronizePressingKey(pressingGoal, z13, logicalKey.longValue(), physicalKey.longValue(), keyEvent, arrayList);
        }
        for (KeyboardMap.TogglingGoal togglingGoal2 : this.togglingGoals.values()) {
            if ((keyEvent.getMetaState() & togglingGoal2.mask) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            synchronizeTogglingKey(togglingGoal2, z12, logicalKey.longValue(), keyEvent);
        }
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            z11 = false;
        } else {
            z11 = true;
        }
        Long l12 = this.pressingRecords.get(physicalKey);
        Long l13 = null;
        if (z11) {
            if (l12 == null) {
                type = KeyData.Type.kDown;
            } else {
                if (keyEvent.getRepeatCount() > 0) {
                    type = KeyData.Type.kRepeat;
                } else {
                    l11 = physicalKey;
                    synthesizeEvent(false, l12, l11, keyEvent.getEventTime());
                    type = KeyData.Type.kDown;
                }
                cCharValue = this.characterCombiner.applyCombiningCharacterToBaseCharacter(keyEvent.getUnicodeChar()).charValue();
                if (cCharValue != 0) {
                    str = "" + cCharValue;
                }
                if (type != KeyData.Type.kRepeat) {
                    if (z11) {
                        l13 = logicalKey;
                    }
                    updatePressingState(l11, l13);
                }
                if (type == KeyData.Type.kDown && (togglingGoal = this.togglingGoals.get(logicalKey)) != null) {
                    togglingGoal.enabled = !togglingGoal.enabled;
                }
                keyData = new KeyData();
                source = keyEvent.getSource();
                if (source != 513) {
                    if (source != 1025) {
                        if (source != 16777232) {
                            if (source != 33554433) {
                                keyData.deviceType = KeyData.DeviceType.kKeyboard;
                            } else {
                                keyData.deviceType = KeyData.DeviceType.kHdmi;
                            }
                        } else {
                            keyData.deviceType = KeyData.DeviceType.kJoystick;
                        }
                    } else {
                        keyData.deviceType = KeyData.DeviceType.kGamepad;
                    }
                } else {
                    keyData.deviceType = KeyData.DeviceType.kDirectionalPad;
                }
                keyData.timestamp = keyEvent.getEventTime();
                keyData.type = type;
                keyData.logicalKey = logicalKey.longValue();
                keyData.physicalKey = l11.longValue();
                keyData.character = str;
                keyData.synthesized = false;
                sendKeyEvent(keyData, onKeyEventHandledCallback);
                it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                return true;
            }
            l11 = physicalKey;
            cCharValue = this.characterCombiner.applyCombiningCharacterToBaseCharacter(keyEvent.getUnicodeChar()).charValue();
            if (cCharValue != 0) {
                str = "" + cCharValue;
            }
            if (type != KeyData.Type.kRepeat) {
                if (z11) {
                    l13 = logicalKey;
                }
                updatePressingState(l11, l13);
            }
            if (type == KeyData.Type.kDown) {
                togglingGoal.enabled = !togglingGoal.enabled;
            }
            keyData = new KeyData();
            source = keyEvent.getSource();
            if (source != 513) {
                if (source != 1025) {
                    if (source != 16777232) {
                        if (source != 33554433) {
                            keyData.deviceType = KeyData.DeviceType.kKeyboard;
                        } else {
                            keyData.deviceType = KeyData.DeviceType.kHdmi;
                        }
                    } else {
                        keyData.deviceType = KeyData.DeviceType.kJoystick;
                    }
                } else {
                    keyData.deviceType = KeyData.DeviceType.kGamepad;
                }
            } else {
                keyData.deviceType = KeyData.DeviceType.kDirectionalPad;
            }
            keyData.timestamp = keyEvent.getEventTime();
            keyData.type = type;
            keyData.logicalKey = logicalKey.longValue();
            keyData.physicalKey = l11.longValue();
            keyData.character = str;
            keyData.synthesized = false;
            sendKeyEvent(keyData, onKeyEventHandledCallback);
            it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return true;
        }
        l11 = physicalKey;
        if (l12 == null) {
            return false;
        }
        type = KeyData.Type.kUp;
        str = null;
        if (type != KeyData.Type.kRepeat) {
            if (z11) {
                l13 = logicalKey;
            }
            updatePressingState(l11, l13);
        }
        if (type == KeyData.Type.kDown) {
            togglingGoal.enabled = !togglingGoal.enabled;
        }
        keyData = new KeyData();
        source = keyEvent.getSource();
        if (source != 513) {
            if (source != 1025) {
                if (source != 16777232) {
                    if (source != 33554433) {
                        keyData.deviceType = KeyData.DeviceType.kKeyboard;
                    } else {
                        keyData.deviceType = KeyData.DeviceType.kHdmi;
                    }
                } else {
                    keyData.deviceType = KeyData.DeviceType.kJoystick;
                }
            } else {
                keyData.deviceType = KeyData.DeviceType.kGamepad;
            }
        } else {
            keyData.deviceType = KeyData.DeviceType.kDirectionalPad;
        }
        keyData.timestamp = keyEvent.getEventTime();
        keyData.type = type;
        keyData.logicalKey = logicalKey.longValue();
        keyData.physicalKey = l11.longValue();
        keyData.character = str;
        keyData.synthesized = false;
        sendKeyEvent(keyData, onKeyEventHandledCallback);
        it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        return true;
    }

    @Override // io.flutter.embedding.android.KeyboardManager.Responder
    public void handleEvent(@NonNull KeyEvent keyEvent, @NonNull KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        if (!handleEventImpl(keyEvent, onKeyEventHandledCallback)) {
            synthesizeEvent(true, 0L, 0L, 0L);
            onKeyEventHandledCallback.onKeyEventHandled(true);
        }
    }

    private static long keyOfPlane(long j11, long j12) {
        return (j11 & KeyboardMap.kValueMask) | j12;
    }
}
