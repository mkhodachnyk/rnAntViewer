package com.reactlibrary;

import android.view.View;
import android.widget.Toast;

import com.antourage.weaverlib.ui.fab.AntourageFab;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;

import javax.annotation.Nonnull;

public class ButtonViewManager extends SimpleViewManager<AntourageFab> implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        WritableMap map = Arguments.createMap();
        ReactContext context = (ReactContext) v.getContext();
        context.getJSModule(RCTEventEmitter.class).receiveEvent(v.getId(),"topChange",map);
    }

    @Nonnull
    @Override
    public String getName() {
        return "ButtonView";
    }

    @Nonnull
    @Override
    protected AntourageFab createViewInstance(@Nonnull ThemedReactContext reactContext) {
        AntourageFab button = new AntourageFab(reactContext);
        //button.setOnClickListener(this);
        return button;
    }
    @ReactProp(name = "enableUpdates")
    public void setEnableUpdates(AntourageFab button,String isEnabled){
        if(Boolean.valueOf(isEnabled)){
            button.onResume();
            Toast.makeText(button.getContext(),"onResume",Toast.LENGTH_LONG).show();
        } else {
            button.onPause();
            Toast.makeText(button.getContext(), "onPause", Toast.LENGTH_LONG).show();
        }
    }

}
