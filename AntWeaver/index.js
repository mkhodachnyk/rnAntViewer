
import { NativeModules } from 'react-native';
import React, { Component } from 'react';
import AntWidget from './AntWidget'
import { AppState, requireNativeComponent, View } from 'react-native';

const { RNAntWeaver } = NativeModules;

 export default class RNAntWidget extends Component {
  render() {
    return (
     <AntWidget />
     );
  }
}
