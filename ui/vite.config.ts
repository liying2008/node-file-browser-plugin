import { defineConfig } from 'vite'
import react, { reactCompilerPreset } from '@vitejs/plugin-react'
import babel from '@rolldown/plugin-babel'

// https://vite.dev/config/
export default defineConfig({
  plugins: [
    react(),
    babel({ presets: [reactCompilerPreset()] })
  ],
  base: './',
  build: {
    outDir: '../src/main/webapp/browser', // 直接输出到 Jenkins 插件资源目录
    emptyOutDir: true,
  },
  server: {
    port: 5173,
    proxy: {
      // 将 API 请求代理回 Jenkins
      '/jenkins': {
        target: 'http://localhost:8080',
        changeOrigin: true,
      },
    },
  },
})
