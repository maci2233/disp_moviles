import React from 'react';
import { StyleSheet, Text, View, TextInput } from 'react-native';

export default class App extends React.Component {

  constructor(props){
    super(props);
    this.state = {
      first_name: "",
      last_name: ""
    }
  }

  render() {
    return (
      <View style={styles.container}>
        <Text>Hello {this.state.first_name} {this.state.last_name}</Text>
        <View>
          <TextInput placeholder="Enter your First Name" onChangeText={(value) => this.setState({first_name: value})} />
        </View>
        <View>
          <TextInput placeholder="Enter your Last Name" onChangeText={(value) => this.setState({last_name: value})} />
        </View>
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
