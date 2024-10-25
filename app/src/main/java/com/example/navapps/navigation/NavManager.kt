package com.example.navegacion.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navegacion.views.DetailView
import com.example.navegacion.views.HomeView

@Composable
fun NavManager(){
    // Método para navegar a AppDescuento
    fun navigateToAppDescuento(context: Context) {
        val intent = Intent(context, AppDescuentoActivity::class.java)
        context.startActivity(intent)
    }

    // Método para navegar a Loto
    fun navigateToLoto(context: Context) {
        val intent = Intent(context, LotoActivity::class.java)
        context.startActivity(intent)
    }

    // Puedes agregar más métodos si integras otras aplicaciones
    fun navigateToOtherApp(context: Context, appClass: Class<*>) {
        val intent = Intent(context, appClass)
        context.startActivity(intent)
    }
}