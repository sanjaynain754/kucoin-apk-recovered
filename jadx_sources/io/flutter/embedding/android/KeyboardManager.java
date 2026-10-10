package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import io.flutter.Log;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import io.flutter.embedding.engine.systemchannels.KeyboardChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.editing.InputConnectionAdaptor;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class KeyboardManager implements InputConnectionAdaptor.KeyboardDelegate, KeyboardChannel.KeyboardMethodHandler {
    private static final String TAG = "KeyboardManager";
    private final HashSet<KeyEvent> redispatchedEvents = new HashSet<>();
    protected final Responder[] responders;
    private final ViewDelegate viewDelegate;

    public static class CharacterCombiner {
        private int combiningCharacter = 0;

        public Character applyCombiningCharacterToBaseCharacter(int i11) {
            char c11 = (char) i11;
            if ((Integer.MIN_VALUE & i11) != 0) {
                int i12 = i11 & Integer.MAX_VALUE;
                int i13 = this.combiningCharacter;
                if (i13 != 0) {
                    this.combiningCharacter = KeyCharacterMap.getDeadChar(i13, i12);
                } else {
                    this.combiningCharacter = i12;
                }
            } else {
                int i14 = this.combiningCharacter;
                if (i14 != 0) {
                    int deadChar = KeyCharacterMap.getDeadChar(i14, i11);
                    if (deadChar > 0) {
                        c11 = (char) deadChar;
                    }
                    this.combiningCharacter = 0;
                }
            }
            return Character.valueOf(c11);
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public class PerEventCallbackBuilder {
        boolean isEventHandled = false;
        final KeyEvent keyEvent;
        int unrepliedCount;

        public class Callback implements Responder.OnKeyEventHandledCallback {
            boolean isCalled;

            private Callback() {
                this.isCalled = false;
            }

            @Override // io.flutter.embedding.android.KeyboardManager.Responder.OnKeyEventHandledCallback
            public void onKeyEventHandled(boolean z11) {
                if (this.isCalled) {
                    throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
                }
                this.isCalled = true;
                PerEventCallbackBuilder perEventCallbackBuilder = PerEventCallbackBuilder.this;
                int i11 = perEventCallbackBuilder.unrepliedCount - 1;
                perEventCallbackBuilder.unrepliedCount = i11;
                boolean z12 = z11 | perEventCallbackBuilder.isEventHandled;
                perEventCallbackBuilder.isEventHandled = z12;
                if (i11 != 0 || z12) {
                    return;
                }
                KeyboardManager.this.onUnhandled(perEventCallbackBuilder.keyEvent);
            }
        }

        public PerEventCallbackBuilder(KeyEvent keyEvent) {
            this.unrepliedCount = KeyboardManager.this.responders.length;
            this.keyEvent = keyEvent;
        }

        public Responder.OnKeyEventHandledCallback buildCallback() {
            return new Callback();
        }
    }

    public interface Responder {

        /* JADX INFO: loaded from: classes60.dex */
        public interface OnKeyEventHandledCallback {
            void onKeyEventHandled(boolean z11);
        }

        void handleEvent(@NonNull KeyEvent keyEvent, @NonNull OnKeyEventHandledCallback onKeyEventHandledCallback);
    }

    public interface ViewDelegate {
        BinaryMessenger getBinaryMessenger();

        boolean onTextInputKeyEvent(@NonNull KeyEvent keyEvent);

        void redispatch(@NonNull KeyEvent keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUnhandled(@NonNull KeyEvent keyEvent) {
        ViewDelegate viewDelegate = this.viewDelegate;
        if (viewDelegate == null || viewDelegate.onTextInputKeyEvent(keyEvent)) {
            return;
        }
        this.redispatchedEvents.add(keyEvent);
        this.viewDelegate.redispatch(keyEvent);
        if (this.redispatchedEvents.remove(keyEvent)) {
            Log.m87483w(TAG, "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }

    public void destroy() {
        int size = this.redispatchedEvents.size();
        if (size > 0) {
            Log.m87483w(TAG, "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.KeyboardChannel.KeyboardMethodHandler
    public Map<Long, Long> getKeyboardState() {
        return ((KeyEmbedderResponder) this.responders[0]).getPressedState();
    }

    @Override // io.flutter.plugin.editing.InputConnectionAdaptor.KeyboardDelegate
    public boolean handleEvent(@NonNull KeyEvent keyEvent) {
        if (this.redispatchedEvents.remove(keyEvent)) {
            return false;
        }
        if (this.responders.length <= 0) {
            onUnhandled(keyEvent);
            return true;
        }
        PerEventCallbackBuilder perEventCallbackBuilder = new PerEventCallbackBuilder(keyEvent);
        for (Responder responder : this.responders) {
            responder.handleEvent(keyEvent, perEventCallbackBuilder.buildCallback());
        }
        return true;
    }

    public KeyboardManager(@NonNull ViewDelegate viewDelegate) {
        this.viewDelegate = viewDelegate;
        this.responders = new Responder[]{new KeyEmbedderResponder(viewDelegate.getBinaryMessenger()), new KeyChannelResponder(new KeyEventChannel(viewDelegate.getBinaryMessenger()))};
        new KeyboardChannel(viewDelegate.getBinaryMessenger()).setKeyboardMethodHandler(this);
    }
}
