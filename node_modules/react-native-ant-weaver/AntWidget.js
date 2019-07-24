import React, { Component } from 'react';
import { AppState, requireNativeComponent, View } from 'react-native';


export default class AntWidget extends Component{
	onChange = (event) =>{
		if(this.props.onTap){
			this.props.onTap(event.nativeEvent.message);
		}
	}

	
  state = {
    appState: AppState.currentState
  }

  componentDidMount() {
    AppState.addEventListener('change', this._handleAppStateChange);
  }

  componentWillUnmount() {
    AppState.removeEventListener('change', this._handleAppStateChange);
  }

  _handleAppStateChange = (nextAppState) => {
    if (this.state.appState.match(/inactive|background/) && nextAppState === 'active') {
      console.log('App has come to the foreground!')
    }
    this.setState({appState: nextAppState});
  }

   render(){
   		if(this.state.appState === 'active'){
			return <ButtonView style={{ height: 100, width: 350 }}  enableUpdates="true"
		 		onChange={this.onChange} />;
		} else{
			return <ButtonView style={{ height: 100, width: 350 }}  enableUpdates="false"
		 		onChange={this.onChange} />;
		}
	}
}

var ButtonView = requireNativeComponent('ButtonView', null);