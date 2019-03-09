import React from 'react';
import { StyleSheet, Text, View, Image } from 'react-native';

export default class App extends React.Component {
  render() {

    let img = {
      uri: 'http://2.bp.blogspot.com/-c1HGY52Rvek/Vig9cDjmp7I/AAAAAAABI5U/Zzkqsu-2wZE/s1600/JADE%2BPICON%2B%252817%2529.JPG'
    }

    return (
      <View style={styles.container}>
        <Text>Open up App.js to start working on your app!</Text>
        <Image source={img} style={{width: 200, height: 300}}/>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
