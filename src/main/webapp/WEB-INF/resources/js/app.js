'use strict';

var AngularSpringApp = {};

var App = angular.module('AngularSpringApp', ['AngularSpringApp.filters', 'AngularSpringApp.services', 'AngularSpringApp.directives']);

// Declare app level module which depends on filters, and services
App.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/cars', {
        templateUrl: 'cars/layout',
        controller: CarController
    });

    $routeProvider.when('/trains', {
        templateUrl: 'trains/layout',
        controller: TrainController
    });    

    $routeProvider.otherwise({redirectTo: '/cars'});
}]);


function MainCtrl($scope, $http) {
     $scope.init = function(data) {
        $scope.links = data;
    };
    // runs once per controller instantiation
//    $scope.init();
}